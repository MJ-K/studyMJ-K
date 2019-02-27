package Client;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import Database.GetMenu;

public class Settlement_Menu extends JFrame{
	
	private JPanel panel1; // title
	private JPanel panel2; // 버튼깔 패널
	private JPanel panel3; // 결제 수량 금액 나올 패널
	
	private JButton[] jbt;
	private JButton input;//입력
	private JButton settlement;// 결제
	private JButton exit;
	
	
	private JLabel title;
	private JLabel total_text;
	private JLabel total;
	private JLabel select_menu_label;
	private JLabel select_menu;
	private JLabel quantity;//수량

	private JTextField input_quantity;
	
	private JScrollPane scrollpane;
	private JTable table;
	private DefaultTableModel model ;
	
	private ActionListener listener = null;
	
	private String[] click_menuName = null;
	private String[] click_menuNo = null;
	private int[] click_menucount;
	private String[] click_menuprice = null;
	private String[] table_title = {"상품번호", "품명", "수량", "금액"};
	private Object[][] data = {};
	
	private int arrsize=0;
	
	private int i = 0;
	private int j = 0;
	private int get_num=0;
	
	private ArrayList<String> arr = null;
	
	public Settlement_Menu(int cuisineNo) {
		
		//기본 jframe 셋팅
		setBounds(10, 0, 1400, 700);
		setTitle("결제");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBounds(0,15,1300,60);
		panel2 = new JPanel();
		panel2.setBounds(10, 170, 700, 300);
		panel3 = new JPanel(null);
		panel3.setBounds(710,80,650,630);
		
		setButton(cuisineNo);
		
		title = new JLabel();
		title.setFont(new Font("돋움", Font.BOLD, 40));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalTextPosition(JLabel.CENTER);
		switch(cuisineNo) {
		case 1 :
			title.setText("한식");
			break;
		case 2 :
			title.setText("중식");
			break;
		case 3 : 
			title.setText("일식");
			break;
		case 4 :
			title.setText("양식");
			break;
		}
		panel1.add(title);
		
		total_text= new JLabel("총결제금액 : ",JLabel.LEFT);
		total_text.setFont(new Font("돋움", Font.BOLD, 27));
		total_text.setBounds(15,20,300,40);
		total_text.setHorizontalTextPosition(JLabel.LEFT);
		
		panel3.add(total_text);
		
		total= new JLabel("0원 ",JLabel.RIGHT);
		total.setFont(new Font("돋움", Font.BOLD, 27));
		total.setBounds(340,20,300,40);
		total.setHorizontalTextPosition(JLabel.RIGHT);
		
		panel3.add(total);
		
	        //actual data for the table in a 2d array
		
		model = new DefaultTableModel(data, table_title){ 
			public boolean isCellEditable(int row, int column)
			{ 
				return false; 
			} 
		}; 


		table = new JTable(model);
		table.setBounds(20,85,530,300);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int point=table.rowAtPoint(e.getPoint());
				int num=0;
				int total_money = 0;
				System.out.println(point);
				if(e.getClickCount()==2) {
					String str =(String) table.getValueAt(point, 1);
				while(num<arrsize) {
					if(str.equals(click_menuName[num])) {
						get_num = num;
						break;
					}
					num++;
				}
				
					jbt[get_num].setEnabled(true);
					model.removeRow(point);
					
					for(int p =0 ;p<model.getRowCount();p++) {
						total_money += Integer.valueOf(table.getValueAt(p,3).toString());
						
					}
					total.setText(Integer.toString(total_money)+"원");
				}
			}
		});
		
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(20,85,630,300);
		
		panel3.add(scrollpane);
		
		select_menu_label = new JLabel("선택품명:");
		select_menu_label.setBounds(20,400,60,30);
		select_menu_label.setFont(new Font("돋움", Font.BOLD, 12));
		
		panel3.add(select_menu_label);

		
		select_menu = new JLabel();
		select_menu.setBounds(85,400,350,30);
		select_menu.setFont(new Font("돋움", Font.BOLD, 12));
		select_menu.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		
		panel3.add(select_menu);
		
		quantity = new JLabel("수량:");
		quantity.setFont(new Font("돋움", Font.BOLD, 12));
		quantity.setBounds(500,400,40,30);
		
		panel3.add(quantity);
		
		input_quantity = new JTextField();
		input_quantity.setBounds(545,400,100,30);
		
		panel3.add(input_quantity);
		
		input = new JButton("입력");
		input.setBounds(50, 440, 150, 50);
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] str = new String[4];
				int num= 0;
				
				while(num<arrsize) {
					if(select_menu.getText().equals(click_menuName[num])) {
						get_num = num;
						break;
					}
					num++;
				}
				
			
				if(select_menu.getText().isEmpty()) {
					showMessage("Message", "메뉴를 선택해 주세요.");
				}else {
					if(input_quantity.getText().isEmpty()) {
						showMessage("Message", "수량을 입력해 주세요.");
						
					}else if(click_menucount[get_num] < Integer.valueOf(input_quantity.getText())) {
						showMessage("Message", "조리가능수량이 부족합니다.");
					}
					else {
						int menu_total = (Integer.valueOf(input_quantity.getText()))*(Integer.valueOf(click_menuprice[get_num]));
						
						System.out.println(menu_total);
						System.out.println("getnum : "+get_num);
						str[0] = click_menuNo[get_num];
						str[1] = click_menuName[get_num];
						str[2] = input_quantity.getText();
						str[3] = Integer.toString(menu_total);
						
						jbt[get_num].setEnabled(false);
						
						model.addRow(str);
						input_quantity.setText(null);
						select_menu.setText(null);
						
						int total_money = 0;
						
						for(int p =0 ;p<model.getRowCount();p++) {
							total_money += Integer.valueOf(table.getValueAt(p,3).toString());
							//System.out.println(total_money);
						}
						
						total.setBounds(340,20,300,40);
						total.setText(Integer.toString(total_money)+"원");
					}
				}
				
			}
		});
		
		panel3.add(input);
		
		settlement = new JButton("결제");
		settlement.setBounds(205, 440, 150, 50);
		settlement.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(table.getRowCount() == 0) {
					showMessage("Message", "메뉴를 선택해 주세요.");
				}
				else {
					String[] selected_No = new String[model.getRowCount()];
					String[] selected_Name = new String[model.getRowCount()];
					int[] selected_count = new int[model.getRowCount()];
					String[] selected_price = new String[model.getRowCount()];
					
					int num = 0;
					while(num<model.getRowCount()) {
						selected_No[num]=model.getValueAt(num, 0).toString();
						selected_Name[num]=model.getValueAt(num, 1).toString();
						selected_count[num]=Integer.valueOf(model.getValueAt(num, 2).toString());
						selected_price[num]=model.getValueAt(num, 3).toString();
						num++;
					}
					
					new Payer_Verification(cuisineNo,selected_No,selected_Name,selected_count,selected_price);
					dispose();
				}
			}
		});
		
		panel3.add(settlement);
		
		exit = new JButton("닫기");
		exit.setBounds(360, 440, 150, 50);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new User();
				dispose();
			}
		});
		panel3.add(exit);
		
		add(panel1);
		add(panel2);
		add(panel3);
		setVisible(true);
	}
	
	//동적으로 버튼깔기 (GRIDLAYOUT)
	public void setButton(int cuisineNo){

		arr=new GetMenu().GetMenu_arr_forbutton(cuisineNo);
		int rowsnum = 0;		
		arrsize = arr.size()/4;
		
		
		if(((arrsize)%5)==0) {
			rowsnum=((arrsize)/5);	
		}else {
			rowsnum = (((arrsize)/5)+1);
		}
		//System.out.println("arrsize : "+arr.size()/3);
		//System.out.println("버튼 줄 수 :"+rowsnum);
		
		panel2.setLayout(new GridLayout(0, 5));
	
		int index = 1;
		jbt = new JButton[arrsize];
		click_menucount = new int[arrsize];
		click_menuName = new String[arrsize];
		click_menuNo = new String[arrsize];
		click_menuprice = new String[arrsize];
		
		while(i<arr.size()) {
	
			String text = arr.get(i+1)+"("+arr.get(i+2)+")";
			//System.out.println("jbt"+j+"번째 "+text);
			jbt[j] = new JButton(text);
			jbt[j].setSize(50, 50);
			jbt[j].setHorizontalTextPosition(JButton.CENTER);
			jbt[j].setVerticalTextPosition(JButton.CENTER);
			
			click_menuNo[j] = arr.get(i);
			click_menuName[j] = arr.get(i+1);
			click_menuprice[j]= arr.get(i+2);
			click_menucount[j] = Integer.valueOf(arr.get(i+3));
			
			panel2.add(jbt[j]);
			j++;
			i+=4;
		}
		
		j = 0;
		
		listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Object source = e.getActionCommand();
				String selectmenu = source.toString();
				
				System.out.println(selectmenu);
				for(int num =0 ; num<arrsize;num++) {
					if(selectmenu.equals(click_menuName[num]+"("+click_menuprice[num]+")")) {
						
						select_menu.setText(click_menuName[num]);
						/*get_num = num;
						break;*/
					}
				}
				/*String[] str = new String[4];
				str[0] = click_menuNo[get_num];
				str[1] = click_menuName[get_num];
				//str[2] = Integer.toString(click_menucount[get_num]+1);
				str[3] = click_menuprice[get_num];
		
			
				model.addRow(str);
				
				System.out.println((get_num+1)+"번째 버튼 입니다.");
				System.out.println(click_menuNo[get_num]+" "+click_menuName[get_num]+" "+click_menuprice[get_num]);*/
				//
				
			}
		};
		
		while(j<arrsize) {

			//System.out.println(j);
			jbt[j].addActionListener(listener);
			j++;
		}
		
	}
	private void showMessage(String title, String message) 
	{
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, title, JOptionPane.ERROR_MESSAGE);
	}
	public static void main(String[] args) {
		new Settlement_Menu(2);
	}

}
