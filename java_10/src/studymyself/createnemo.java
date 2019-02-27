package studymyself;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class createnemo extends JFrame{
	//사각형그리기(상속 사용)
	
	JPanel panel;
	
	createnemo() {
		setBounds(100,100,220,290);
		setTitle("사각형그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("닫힘");
				dispose();
			}
		});
		setContentPane(new MyPanel());
		setVisible(true);
	}

	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
			g.drawRect(20, 20, 30, 30);
			g.drawRect(40, 40, 100, 100);
			
			g.setColor(Color.magenta);
			g.drawRect(100, 100, 30, 30);
		}
	}
	public static void main(String[] args) {
		new createnemo();
	}
}
