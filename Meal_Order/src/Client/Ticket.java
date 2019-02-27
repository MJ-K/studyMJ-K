package Client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ticket extends JFrame{
	
	private JScrollPane scrollpane;
	
	private JLabel ticket;
	private JLabel serialNum;
	private JLabel price;
	private JLabel menu;
	private JLabel menu_l;
	private JLabel quantity;
	
	private JPanel mainpanel;
	
	private int width = 0;
	private int height = 0;
	private int count_panel = 0;
	private int totalcount = 0;
	
	private int[] selectedCount;
	
	public Ticket(int cuisineNo, String[] mealName, String memberNo, int[] menuCount, String[] menuPrice, String tickettime) {
		
		setBounds(100, 100, 365, 310);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("식권");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("닫힘");
				new User();
				dispose();
			}
		});
	
		scrollpane = new JScrollPane();
		scrollpane.setBounds(0,0,350,610);
		scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		mainpanel = new JPanel();
		mainpanel.setLayout(new GridLayout(0, 1, 0, 10));
		
		scrollpane.setViewportView(mainpanel);
	
		selectedCount = new int[menuCount.length];
		
	
		
		for(int i=0;i<menuCount.length;i++) {
			totalcount+=menuCount[i];
			selectedCount[i] = 1;
		}
		
		int length = 0;
		
		for(int i=0;i<totalcount;i++){
			
			JPanel ticketpanel = new JPanel();
			ticketpanel.setPreferredSize(new Dimension(350, 260));
			//grid안에 들어가기때문에(배치관리자) setpreferredsize 사용
			if(length%2==0) {
				ticketpanel.setBackground(Color.CYAN);
			}else {
				ticketpanel.setBackground(Color.PINK);
			}
			ticketpanel.setLayout(null);
			ticketpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
			System.out.println(height);
			
			ticket = new JLabel("식권");
			ticket.setFont(new Font("돋움", Font.BOLD, 35));
			ticket.setBounds(130, 80, 100, 60);
			
			serialNum = new JLabel();
			serialNum.setFont(BasicFont());
			serialNum.setBounds(5, 5, 220, 50);
			serialNum.setText(tickettime+"-"+memberNo+"-"+cuisineNo); //식권발행 년,월,일,시,분,초-memberno-cuisineNo
			
			price = new JLabel();
			price.setFont(new Font("돋움", Font.BOLD, 35));
			price.setBounds(110,130,200,60);
			price.setText(menuPrice[length]+"원"); //menuprice
			
			menu_l = new JLabel("메뉴 :");
			menu_l.setFont(BasicFont());
			menu_l.setBounds(10, 215, 50, 30);
			
			menu = new JLabel();
			menu.setFont(BasicFont());
			menu.setBounds(60, 215, 100, 30);
			menu.setText(mealName[length]); //menuname
			
			quantity = new JLabel();
			quantity.setFont(BasicFont());
			quantity.setBounds(280, 215, 50, 30);
			quantity.setText(selectedCount[length]+"/"+menuCount[length]); //menucount
			
			ticketpanel.add(ticket);
			ticketpanel.add(serialNum);
			ticketpanel.add(price);
			ticketpanel.add(menu_l);
			ticketpanel.add(menu);
			ticketpanel.add(quantity);
			
			mainpanel.add(ticketpanel);
		
			System.out.println("1. selectedCount["+length+"] : "+ selectedCount[length] );
			
			if(selectedCount[length]!=menuCount[length]) {
				System.out.println("들어옴");
				selectedCount[length]++;
				System.out.println("2. selectedCount["+length+"] : "+ selectedCount[length] );
			}else {
				length++;
			}
			count_panel++;
		}
		
		if(count_panel>1) {
			setBounds(0,0,360,640);
		}
		
		add(scrollpane);
		setVisible(true);
	}
	
	public Font BasicFont() {
		
		return new Font("돋움", Font.BOLD, 15);
	}
	
	/*public static void main(String[] args) {
		//new Ticket();
	}*/
}
