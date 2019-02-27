package Client_not_use;
/*package Client;

import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import DataBase.GetPath;


public class Client_Main_home extends JFrame{
	
private Container container;
	
	private JLayeredPane layeredPane = new JLayeredPane();
	private BackGround back = new BackGround();
	
	private JButton Member_regis;
	private JButton User;
	private JButton Manager;
	private JButton Exit;

	
	private BufferedImage background =null;
	
	class BackGround extends JLayeredPane 
	{
        public void paint(Graphics g) 
        {	
        	try {
				background = ImageIO.read(new File("src/Image/main_menu.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
        	
        	g.drawImage(background, 0, 0, null);
        }
    }
	
	public Client_Main_home() {
		
		connectDB();
		
		setBounds(400, 50, 300, 500);
		setTitle("Main");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
			
		JLayeredPane _layeredPane = new JLayeredPane();
		_layeredPane.setBounds(0,0,300,500);
		_layeredPane.setLayout(null);
		
		Member_regis = new JButton(new ImageIcon("src/Image/member_reg.png"));
		Member_regis.setRolloverIcon(new ImageIcon("src/Image/member_reg_r.png"));
		//Member_regis.setFont(font);
		Member_regis.setBounds(10, 100, 270, 100);
		Member_regis.setBorderPainted(false);
		Member_regis.setFocusPainted(false);
		Member_regis.setContentAreaFilled(false);
		Member_regis.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Member_register();
				dispose();
			}
		});
		
		_layeredPane.add(Member_regis);
		
		User = new JButton(new ImageIcon("src/Image/member_reg.png"));
		User.setRolloverIcon(new ImageIcon("src/Image/member_reg_r.png"));
		//Member_regis.setFont(font);
		User.setBounds(10, 180, 270, 100);
		User.setBorderPainted(false);
		User.setFocusPainted(false);
		User.setContentAreaFilled(false);
		
		_layeredPane.add(User);
		
		Manager = new JButton(new ImageIcon("src/Image/member_reg.png"));
		Manager.setRolloverIcon(new ImageIcon("src/Image/member_reg_r.png"));
		//Member_regis.setFont(font);
		Manager.setBounds(10, 260, 270, 100);
		Manager.setBorderPainted(false);
		Manager.setFocusPainted(false);
		Manager.setContentAreaFilled(false);
		
		_layeredPane.add(Manager);
		
		
		Exit = new JButton(new ImageIcon("src/Image/member_reg.png"));
		Exit.setRolloverIcon(new ImageIcon("src/Image/member_reg_r.png"));
		//Member_regis.setFont(font);
		Exit.setBounds(10, 340, 270, 100);
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
		
		
		back.setBounds(0,0,300,500);
		
		try/////logo
		{
			 Toolkit tk = Toolkit.getDefaultToolkit(); 
			 Image image = tk.getImage("gui/logo.png");
			 this.setIconImage(image);
		}
		catch(Exception e)
		{
			System.out.println("Appilcation icon not found");
		}	
		
		
		//배경
		_layeredPane.add(back);
		
		getContentPane().add(_layeredPane);
		
		setVisible(true);
	}
	
	
	private void connectDB() {
		
	}
}
*/