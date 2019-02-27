package Client;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Client_Main_Home_Grid extends JFrame {
	
	private JButton memberregis;
	private JButton user;
	private JButton manager;
	private JButton exit;
	
	public Client_Main_Home_Grid() {
		
		setBounds(100,100, 300,250);
		setTitle("Main");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));
		
		memberregis = new JButton("사원 등록");
		memberregis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Client_Member_Register();
				dispose();
			}
		});
		
		user = new JButton("사용자");
		user.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new User();
			}
		});
		
		manager = new JButton("관리자");
		manager.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager();
				dispose();
			}
		});
		
		
		exit = new JButton("종료");
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		add(memberregis);
		add(user);
		add(manager);
		add(exit);
		
		setVisible(true);
	}
	
}
