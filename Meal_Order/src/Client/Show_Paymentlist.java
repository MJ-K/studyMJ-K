package Client;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import Database.GetMenu;
import Database.GetOrdrelist;
import Database.Modify_Menu_Server;

public class Show_Paymentlist extends JFrame{
	

	private JLabel menuName;
	private JTextField menuName_t;
	private JButton search;
	private JButton all_show;
	private JButton print;
	private JButton exit;
	
	private String[] table_title = {"종류","메뉴명", "사원명","결제수량","총결제금액","결제일"};
	
	private JPanel buttonpanel;
	private JPanel tablepanel;
	
	private Object[][] data = {};
	private DefaultTableModel model;
	
	private JScrollPane scrollpane;
	private JTable table;
	
	private GridBagConstraints c;
	
	private String[] amount;
	private String[] mealName;
	private String[] todayMeal;
	private String[] mealprice;
	private String[] cuisineNo;
	private String[] memberName;
	
	private int arrsize = 0;
	
	private DefaultTableCellRenderer dt;

	
	public Show_Paymentlist() {
		
		setBounds(50, 50, 525, 528);
		setResizable(false);
		setTitle("결제 조회");
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				new Manager();
				dispose();
			}
		});
		
		setLayout(null);
		
		buttonpanel = new JPanel(new GridBagLayout());
		buttonpanel.setBounds(0,0,520,50);
		//buttonpanel.setBackground(Color.BLACK);
		tablepanel = new JPanel(new GridLayout(1, 1));
		tablepanel.setBounds(0,50,520,450);

		c= new GridBagConstraints();
		
		//Object [][] datas = {{"한식","돌솥","강해준","1","4500","2016-10-03"},{"한식","김치","강해준","1","1000","2016-10-03"}};
		
		///데이터 받기" 순번  종류번호	음식번호(메뉴명으로)	사번(이름으로)	총주문(결제수량) 금액(결제금액) 주문일자"
		model = new DefaultTableModel(data,table_title){ 
			public boolean isCellEditable(int row, int column)
			{ 
				return column == 0; 
			} 
		}; 
		
		paymentData();
		setModel_orderlist();
		
		//////버튼과 라벨		
		menuName = new JLabel("메뉴명 :");
		menuName.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0, 0, 0, 5);
		buttonpanel.add(menuName,c);
		
		menuName_t = new JTextField(10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.weighty = 1;
		buttonpanel.add(menuName_t,c);
		
		search = new JButton("조회");
		search.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<Integer> index = new ArrayList<Integer>();
				for(int i=0;i<arrsize;i++) {
					if(mealName[i].contains(menuName_t.getText())) {
						index.add(i);
					}
				}
				model.setRowCount(0);
				setModel_orderlist(index);
				table.repaint();
				
			}
		});
		buttonpanel.add(search,c);
		
		all_show = new JButton("모두 보기");
		all_show.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 0;
		all_show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				menuName_t.setText(" ");
				model.setRowCount(0);
				setModel_orderlist();
				table.repaint();
			}
		});
		buttonpanel.add(all_show,c);
		
		
		exit = new JButton("닫기");
		exit.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 0;
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				dispose();
			}
		});
		buttonpanel.add(exit,c);
		
		///////////////테이블 패널
		 
		
		table = new JTable(model);
		//셀 간격 맞춤
		
		dt =  new DefaultTableCellRenderer();
		dt.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i= 0 ;i<table.getColumnCount();i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(dt);
		}


		scrollpane = new JScrollPane(table);
		//scrollpane.setPreferredSize(new Dimension(width, height));
		//scrollpane.setBounds(0, 0, 600, 550);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		//인쇄
		print = new JButton("인쇄");
		print.setFont(buttonFont());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		print.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					table.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		buttonpanel.add(print,c);
		
		
		tablepanel.add(scrollpane);
		
		
		add(tablepanel);
		add(buttonpanel);
		setVisible(true);
	}
	
	private void showErrorMessage(String message) {
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, message,"Message",JOptionPane.ERROR_MESSAGE);
	}
	
	private void showMessage(String message) 
	{
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private Font buttonFont() {
		return new Font("돋움", Font.BOLD, 13);
	}
	
	
	private void paymentData() {
		
		int i = 0;
		int j = 0;
	
		ArrayList<String >arr=new ArrayList<String>();
		arr = new GetOrdrelist().getOrderlistData();
		arrsize = arr.size()/6;
		
		cuisineNo= new String[arrsize];
		mealName = new String[arrsize];
		memberName = new String[arrsize];
		amount = new String[arrsize];
		mealprice = new String[arrsize];
		todayMeal = new String[arrsize];
		
		while(i<arr.size()) {
			
			cuisineNo[j] = arr.get(i);
			mealName[j] = arr.get(i+1);
			memberName[j]= arr.get(i+2);
			amount[j] = arr.get(i+3);
			mealprice[j] = arr.get(i+4);
			todayMeal[j] = arr.get(i+5);
		
			System.out.println(cuisineNo[j] +""+mealName[j]+""+memberName[j]
					+""+amount[j]+""+mealprice[j]+""+todayMeal[j]);
			
			j++;
			i+=6;
		}
	}
	private void setModel_orderlist() {
		Object [][] ob = new Object[arrsize][6];
	
		
		for(int i=0;i<arrsize;i++) {
			ob[i][0] = cuisineNo[i];
			ob[i][1] = mealName[i];
			ob[i][2] = memberName[i];
			ob[i][3] = amount[i];
			ob[i][4] = mealprice[i];
			ob[i][5] = todayMeal[i].substring(0, 10);
			model.addRow(ob[i]);
		}	
	}
	private void setModel_orderlist(ArrayList<Integer> index) {
		Object [][] ob = new Object[arrsize][6];
		
		for(int i=0;i<index.size();i++) {
			ob[i][0] = cuisineNo[index.get(i)];
			ob[i][1] = mealName[index.get(i)];
			ob[i][2] = memberName[index.get(i)];
			ob[i][3] = amount[index.get(i)];
			ob[i][4] = mealprice[index.get(i)];
			ob[i][5] = todayMeal[index.get(i)].substring(0, 10);
			model.addRow(ob[i]);
		}	
	}
	
	
	public static void main(String[] args) {
		new Show_Paymentlist();
	}
}
