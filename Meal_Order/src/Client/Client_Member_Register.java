package Client;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Database.Member_Register_Server;

public class Client_Member_Register extends JFrame {
	
	private GridBagConstraints c;
	
	private JLabel memberno;
	private JLabel membername;
	private JLabel passwd;
	private JLabel passwdcorrect;
	
	private JLabel memberno_t;
	private JTextField membername_t;
	private JPasswordField passwd_t;
	private JPasswordField passwdcorrect_t;
	
	private JButton exit;
	private JButton register;
	
	private JButton button;
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private String name = null;
	private char[] password = null; 
	private int new_memberno = 0;
	
	
	public Client_Member_Register() {
		
		setBounds(100, 100, 430, 310);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("사원등록");
		setResizable(false);
		
		setLayout(new GridBagLayout());
	    c = new GridBagConstraints();
		
		Member_Register_Server mrs = new Member_Register_Server(conn, pstmt);
		new_memberno = mrs.get_MemeberNo();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					conn.close();
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					mrs.pstmt.close();
					mrs.conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				new Client_Main_Home_Grid();
				dispose();
			}
		});
		
		memberno = new JLabel("사원번호:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 0;
		add(memberno,c);
		
		membername = new JLabel("사원명:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 1;
		add(membername,c);
		
		passwd = new JLabel("패스워드:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 2;
		add(passwd,c);
		
		passwdcorrect = new JLabel("패스워드 재입력:");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 3;
		add(passwdcorrect, c); 
		
		memberno_t = new JLabel(Integer.toString(new_memberno));
		memberno_t.setBorder(BorderFactory.createLineBorder(Color.lightGray, 1));
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 0;
		add(memberno_t, c); 
		
		membername_t = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 1;
		name = membername_t.getText();
		add(membername_t, c); 
		
		passwd_t = new JPasswordField();	
		passwd_t.setEchoChar('●');
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.ipadx = 30;
		c.weightx = 0.5;
		c.gridx = 1;
		c.gridy = 2;
		add(passwd_t, c); 
		
		passwdcorrect_t = new JPasswordField();
		passwdcorrect_t.setEchoChar('●');
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 1;
		c.gridy = 3;
		add(passwdcorrect_t, c); 
		
		register = new JButton("등록");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 30;
		c.gridx = 0;
		c.gridy = 4;
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(membername_t.getText().isEmpty()|| passwd_t.getPassword().length == 0||passwdcorrect_t.getPassword().length ==0) 
				{
					//항목누락 메세지 출력
		
					/*System.out.println("password : "+passwd_t.getPassword().length);
					System.out.println("passwordcorrect : "+passwdcorrect_t.getPassword().length);*/
					showErrorMessage("Message", "항목 누락");

				}else {
					
					if(String.valueOf(passwd_t.getPassword()).equals(String.valueOf(passwdcorrect_t.getPassword()))) {
						
						name = membername_t.getText();
						password = passwdcorrect_t.getPassword();
						mrs.Register_DB(name, password);
						
						System.out.println("name :"+name);
						System.out.println("password : "+password.toString());

						//사원이 등록되었습니다. 출력
						showMessage("Message", "사원이 등록되었습니다.");
						new Client_Main_Home_Grid();
						dispose();
					}
					else {
						//패스워드 다름 메세지 출력
						password = passwdcorrect_t.getPassword();
						System.out.println("passwordcorrect : "+String.valueOf(passwdcorrect_t.getPassword()));
						showErrorMessage("Message", "패스워드 확인 요망");
					}
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
				try {
					mrs.pstmt.close();
					mrs.conn.close();
					if(mrs.conn.isClosed()) {
						//System.out.println("yes!");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				new Client_Main_Home_Grid();
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
	
/*	public static void main(String[] args) {
		new Client_Member_Register();
	}*/
}
