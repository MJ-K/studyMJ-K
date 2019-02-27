package Client_not_use;
/*package Client;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Member_register extends JFrame{
	
	private JLabel memberNo;
	private JLabel memberName;
	private JLabel passwd;
	private JLabel passwdCorrect;
	
	private JButton Register;
	private JButton Exit;
	
	private JLabel noField;
	private JTextField nameField;
	private JPasswordField passwdField;
	private JPasswordField passwdCorrectField;
	
	private String name;
	
	public Member_register() {
		
		setBounds(400, 200, 500, 400);
		setTitle("사원 등록");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLayeredPane _layeredPane = new JLayeredPane();
		_layeredPane.setBounds(0,0,500,400);
		_layeredPane.setLayout(null);
		
		noField = new JLabel();
		noField.setBounds(220, 30, 200, 40);
		noField.setText("hello");
		noField.setForeground(Color.black);
		noField.setBorder(BorderFactory.createLineBorder(Color.black, 1));
		//noField.setVerticalTextPosition();
		
		_layeredPane.add(noField);
		
		nameField = new JTextField();
		nameField.setBounds(220, 85, 200, 40);
		//nameField.setFont(_font1);
		//nameField.setBorder(BorderFactory.createEmptyBorder());
		//nameField.setForeground(Color.BLACK);
		//nameField.setOpaque(false); 
		nameField.addKeyListener(new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent _e) { }
	
			@Override
			public void keyReleased(KeyEvent _e) 
			{
				name = nameField.getText();
			}


			@Override
			public void keyTyped(KeyEvent _e)
			{}

		});
		
		_layeredPane.add(nameField);
		
		passwdField = new JPasswordField();
		passwdField.setBounds(220, 140, 200, 40);
		passwdField.setEchoChar('●');
		
		_layeredPane.add(passwdField);
		
		passwdCorrectField = new JPasswordField();
		passwdCorrectField.setBounds(220, 195, 200, 40);
		passwdCorrectField.setEchoChar('●');
		
		_layeredPane.add(passwdCorrectField);
		
		Register = new JButton(new ImageIcon("src/Image/member_reg.png"));
		Register.setRolloverIcon(new ImageIcon("src/Image/member_reg_r.png"));
		//Member_regis.setFont(font);
		Register.setBounds(25, 250, 270, 100);
		Register.setBorderPainted(false);
		Register.setFocusPainted(false);
		Register.setContentAreaFilled(false);
		Register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//사원등록
			}
		});
		
		_layeredPane.add(Register);
		
		Exit = new JButton(new ImageIcon("src/Image/member_reg.png"));
		Exit.setRolloverIcon(new ImageIcon("src/Image/member_reg_r.png"));
		//Member_regis.setFont(font);
		Exit.setBounds(200, 250, 270, 100);
		Exit.setBorderPainted(false);
		Exit.setFocusPainted(false);
		Exit.setContentAreaFilled(false);
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		_layeredPane.add(Exit);
		
		getContentPane().add(_layeredPane);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Member_register();
	}
	
	private void showMessage(String title, String message) 
	{
		Font fontbt = new Font("SansSerif", Font.BOLD,24);
		JLabel input = new JLabel(message);
		input.setFont(fontbt);
		JOptionPane.showMessageDialog(null, input, title, JOptionPane.INFORMATION_MESSAGE);
	}
}
*/