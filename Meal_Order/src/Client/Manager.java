package Client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Manager extends JFrame{
	
	private JPanel panel1;
	private JPanel paenl2;
	
	private GridBagConstraints c;
	
	private JButton register;
	private JButton manager;
	private JButton settlement_check;
	private JButton menuorder_status;
	private JButton exit;
	
	private JLabel m_image;
	
	public Manager() {
		
		setBounds(100, 100, 590, 470);
		setTitle("관리");
		setResizable(false);	
		setLayout(null);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new Client_Main_Home_Grid();
				dispose();
			}
		});
		
	
		
		panel1 = new JPanel(new GridBagLayout());
		paenl2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		c = new GridBagConstraints();		
		
		register = new JButton("메뉴등록");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,3); 
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new New_Menu_Register();
				dispose();
			}
		});
		panel1.add(register,c);
		
		manager = new JButton("메뉴관리");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,3); 
		manager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Menu_Manager(0);
				dispose();
			}
		});
		panel1.add(manager,c);
		
		settlement_check = new JButton("결제조회");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,3); 
		settlement_check.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Show_Paymentlist();
				dispose();
			}
		});
		panel1.add(settlement_check,c);
		
		menuorder_status = new JButton("메뉴별 주문현황");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(0,0,0,3); 
		menuorder_status.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Show_Menu_Orderlist();
				dispose();
			}
		});
		panel1.add(menuorder_status,c);
		
		exit = new JButton("종료");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Client_Main_Home_Grid();
				dispose();
			}
		});
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		panel1.add(exit,c);
		
		panel1.setBounds(30,5,500,30);
		add(panel1);
		
		m_image = new JLabel(new ImageIcon("src/Image/main.jpg"));
		m_image.setBounds(0, 0, 520, 500);

		paenl2.add(m_image);
		paenl2.setBounds(0,40,590,500);
		add(paenl2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Manager();
	}
}
