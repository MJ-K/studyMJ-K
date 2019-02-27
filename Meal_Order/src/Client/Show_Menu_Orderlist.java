package Client;

import java.awt.BorderLayout;
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
import javax.swing.RowSorter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Database.GetCuisineCount;
import Database.GetMenu;
import Database.GetOrdrelist;
import Database.Modify_Menu_Server;

public class Show_Menu_Orderlist extends JFrame{
	
	private JButton exit;
	private JLabel total;
	
	private String[] table_title = {"종류","주문수량"};
	
	private JPanel buttonpanel;
	private JPanel tablepanel;
	private JPanel totalpanel;
	
	private Object[][] data = {};
	private DefaultTableModel model;
	
	private JScrollPane scrollpane;
	private JTable table;
	private TableRowSorter tablesorter;
	
	private GridBagConstraints c;
	
	private int[] cuisineNo;
	private int[] cuisineCount;

	private int arrsize = 0;
	private RowSorter<TableModel> sorter;
	
	private DefaultTableCellRenderer dt;
	
	public Show_Menu_Orderlist() {
		
		setBounds(50, 50, 300, 200);
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
		
		buttonpanel = new JPanel(new BorderLayout());
		buttonpanel.setBounds(220,5,70,30);
		//buttonpanel.setBackground(Color.BLACK);
		tablepanel = new JPanel(new GridLayout(1, 1));
		tablepanel.setBounds(0,40,300,100);
		totalpanel = new JPanel(new BorderLayout());
		totalpanel.setBounds(220,140,70,30);
		//totalpanel.setBackground(Color.BLACK);
		
		model = new DefaultTableModel(data,table_title){ 
			public boolean isCellEditable(int row, int column)
			{ 
				return column == 0; 
			} 
			public Class getColumnClass(int column) {
		        if (column >= 0 && column <= getColumnCount())
		          return getValueAt(0, column).getClass();
		        else
		          return Object.class;
		      }
		}; 
		
		cuisineTotalData();
		setModel_total();
		
		////////////
		exit = new JButton("닫기");
		exit.setFont(buttonFont());
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				dispose();
			}
		});
		buttonpanel.add(exit);
		
		
		//////////
		table = new JTable(model);
		sorter = new TableRowSorter<TableModel>(model);	
		table.setRowSorter(sorter); 
		
		/*tablesorter = new TableRowSorter(table.getModel());
		
		table.setAutoCreateRowSorter(false);
		table.setRowSorter(tablesorter);*/

		dt =  new DefaultTableCellRenderer();
		dt.setHorizontalAlignment(SwingConstants.CENTER);
		for(int i= 0 ;i<table.getColumnCount();i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(dt);
		}
		
		scrollpane = new JScrollPane(table);
		tablepanel.add(scrollpane);
		/////
		
		total = new JLabel("합계:51개");
		
		totalpanel.add(total);
		

		add(buttonpanel);
		add(tablepanel);
		add(totalpanel);
		setVisible(true);
	}
	private Font buttonFont() {
		return new Font("돋움", Font.BOLD, 13);
	}
private void cuisineTotalData() {
		
		int i = 0;
		int j = 0;
	
		int[] count=new int[8];
		count = new GetCuisineCount().countCuisine();

		
		cuisineNo= new int[4];
		cuisineCount = new int[4];
		
		while(i<8) {
			
			cuisineNo[j] = count[i];
			cuisineCount[j] = count[i+1];
			
			System.out.println(cuisineNo[j] +" "+cuisineCount[j]);
			
			j++;
			i+=2;
		}
	}
	
	private void setModel_total() {
		Object [][] ob = new Object[4][2];
		
		for(int i=0;i<4;i++) {
			switch(cuisineNo[i]) {
			case 1 :
				ob[i][0] = "한식";
				break;
			case 2 :
				ob[i][0] = "중식";
				break;
			case 3 :
				ob[i][0] = "일식";
				break;
			case 4 :
				ob[i][0] = "양식";
				break;
			}
			ob[i][1] = cuisineCount[i];
			model.addRow(ob[i]);
		}	
	}
	public static void main(String[] args) {
		new Show_Menu_Orderlist();
	}
}
