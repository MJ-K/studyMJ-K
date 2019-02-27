package Client;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class User extends JFrame{
private GridBagConstraints c;
	
	private JButton kr;//한식
	private JButton ch;//중식
	private JButton jp;//일식
	private JButton am;//양식
	
	private Connection conn;
	private PreparedStatement pstmt;
	
	private JLabel maintext;
	private JComponent menu;
	private JTextArea timer;
	
	private JTabbedPane tab;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
		
	private String name = null;
	private char[] password = null; 
	private int new_memberno = 0;
	
	public User() {
		
		setBounds(100, 100, 515, 820);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("식권 발매 프로그램");
		setLayout(null);
		setResizable(false);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				dispose();
			}
		});
		
		panel1 = new JPanel();
		panel2 = new JPanel(new GridLayout(1, 1));
		panel3 = new JPanel();
		tab = new JTabbedPane();
		
		Font font = new Font("돋움", Font.BOLD, 23);
		
		maintext = new JLabel("식권 발매 프로그램");
		maintext.setHorizontalTextPosition(SwingConstants.CENTER);
		maintext.setFont(font);
		
		maintext.setBounds(0, 0, 510, 50);
		panel1.setBounds(0, 0, 510, 50);
		
		panel1.add(maintext);
		add(panel1);
		
		menu = makeMenuPanel(); // 여기에 메뉴에 들어갈 것 만들기
		tab.addTab("메뉴", menu);
		
		panel2.setBounds(0,50,510,700);
		
		panel2.add(tab);
	    add(panel2);
	    
	    
	    timer = new JTextArea();
	    timer.setEditable(false);
	    timer.setBounds(0, 0, 510, 40);
	    timer.setBackground(Color.black);
	    timer.setForeground(Color.WHITE);
	    timer.setFont(font);
	    Runnable r = new CurrentTime();
	    Thread t = new Thread(r);
	    t.start();
	    
	    panel3.setBounds(0, 750, 510, 40);
	    panel3.setBackground(Color.BLACK);
	    
	    panel3.add(timer);
	    add(panel3);
	    
	    
	    setVisible(true);
	}
	 protected JComponent makeMenuPanel() {
	        JPanel panel = new JPanel(new GridLayout(2, 2));
	        
	        kr = new JButton(new ImageIcon("src/Image/menu_1.png"));
	        kr.setToolTipText("한식");
	        kr.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Settlement_Menu(1);
					dispose();
				}
			});
	        
	        ch = new JButton(new ImageIcon("src/Image/menu_2.png"));
	        ch.setToolTipText("중식");
	        ch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Settlement_Menu(2);
					dispose();
				}
			});
	        
	        jp = new JButton(new ImageIcon("src/Image/menu_3.png"));
	        jp.setToolTipText("일식");
	        jp.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Settlement_Menu(3);
					dispose();
				}
			});
	        
	        am = new JButton(new ImageIcon("src/Image/menu_4.png"));	        
	        am.setToolTipText("양식");
	        am.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new Settlement_Menu(4);
					dispose();
				}
			});
	        
	        panel.add(kr);
	        panel.add(ch);
	        panel.add(jp);
	        panel.add(am);
	        return panel;
	    }
	 	
	    
	 class CurrentTime implements Runnable{

			@Override
			public void run() {
				while(true) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					Calendar cal = Calendar.getInstance();
					 
					//현재 년도, 월, 일
				/*	int year = cal.get ( cal.YEAR );
					int month = cal.get ( cal.MONTH ) + 1 ;
					int date = cal.get ( cal.DATE ) ;
					 
					
					//현재 (시,분,초)
					int hour = cal.get ( cal.HOUR_OF_DAY ) ;
					int min = cal.get ( cal.MINUTE );
					int sec = cal.get ( cal.SECOND );*/
					
					timer.setText("현재시간 : "+cal.get ( cal.YEAR )+"년"+(cal.get ( cal.MONTH ) + 1 )
							+"월"+cal.get ( cal.DATE )+"일"
							+cal.get ( cal.HOUR_OF_DAY )+"시"+cal.get ( cal.MINUTE )+"분"+cal.get ( cal.SECOND )+"초");
				}
			}
			
			
	} 
	 
	/* public static void main(String[] args) {
		new User();
	}*/
}


