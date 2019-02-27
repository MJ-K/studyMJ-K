package Client;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Database.Member_Register_Server;
import Database.New_Menu_Register_Server;

public class New_Menu_Register extends JFrame {
	
	private GridBagConstraints c;
	
	private JLabel memberno;
	private JLabel membername;
	private JLabel passwd;
	private JLabel passwdcorrect;
	
	private JComboBox<String> cuisineNo;
	private JTextField mealName;
	private JComboBox<String> price;
	private JComboBox<String> maxcount;
	
	private String[] str_cuisineNo = {"한식", "중식", "일식", "양식"};
	private String[] str_price = new String[23];//1000~1200(500단위)
	private String[] str_maxcount = new String[51];//0~50
	
	private String cuisineNumber = null;
	private String name =null;
	
	private JButton exit;
	private JButton register;
	private JButton button;	
	
	
	public New_Menu_Register() {
		
		setBounds(100, 100, 430, 310);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("신규 메뉴 등록");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new Manager();
				dispose();
			}
		});
		
	
		setLayout(new GridBagLayout());
	    c = new GridBagConstraints();
	    
	    int start = 1000;
	    
	    for(int i=0;i<str_price.length;i++) {
	    	str_price[i] = Integer.toString(start);
	    	start+=500;
	    }
	   
	    
	    for(int i=0;i<str_maxcount.length;i++) {
	    	str_maxcount[i] = Integer.toString(i);
	    }
		
		memberno = new JLabel("종류");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 0;
		add(memberno,c);
		
		membername = new JLabel("메뉴명");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 1;
		add(membername,c);
		
		passwd = new JLabel("가격");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 2;
		add(passwd,c);
		
		passwdcorrect = new JLabel("조리가능수량");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 3;
		add(passwdcorrect, c); 
		
		cuisineNo = new JComboBox<>(str_cuisineNo);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 0;
		add(cuisineNo, c); 
		
		mealName = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 1;
		name = mealName.getText();
		add(mealName, c); 
		
		price = new JComboBox<>(str_price);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.ipadx = 30;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 2;
		add(price, c);
		
		maxcount = new JComboBox<>(str_maxcount);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 3;
		add(maxcount, c); 
		
		register = new JButton("등록");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 4;
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(cuisineNo.getSelectedItem().toString()) {
				case "한식" : 
					cuisineNumber = "1";
					break;
				case "중식" :
					cuisineNumber = "2";
					break;
				case "일식" : 
					cuisineNumber = "3";
					break;
				case "양식" : 
					cuisineNumber = "4";
					break;
				}
				
				if(mealName.getText().equals("")) {
					showErrorMessage("Message", "메뉴명을 입력해주세요.");
				}
				else {
					new New_Menu_Register_Server().Register(cuisineNumber,
							mealName.getText(), price.getSelectedItem().toString(),
							maxcount.getSelectedItem().toString());
					showMessage("Message", "메뉴가 등록되었습니다.");
					dispose();
					new Manager();
				}
			}
		});
		add(register,c);
		
		exit = new JButton("닫기");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 4;
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				dispose();	
			}
		});
		add(exit,c);
		
	
		setVisible(true);
	}
	private void showMessage(String title, String message) 
	{
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, title, JOptionPane.INFORMATION_MESSAGE);
	}
	private void showErrorMessage(String title, String message) 
	{
		Font fontbt = new Font("돋움", Font.BOLD,15);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, title, JOptionPane.ERROR_MESSAGE);
	}
	
	public static void main(String[] args) {
		new New_Menu_Register();
	}
}
