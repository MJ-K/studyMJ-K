package d20180912;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonControl extends Frame implements KeyListener {
	
	Button btn1;
	
	ButtonControl() {
		
		setSize(800, 600);
		setVisible(true);
		setLayout(null);
		
		btn1 = new Button("^__^");
	/*	btn1.setSize(50,50);
		btn1.setLocation(400, 300);*/
		btn1.setBounds(400,300,50,50);
		
		add(btn1);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("종료");
				System.exit(0);
			}
		});
		this.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new ButtonControl();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//버튼 타입
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//버튼 누를 때
		int key = e.getKeyCode();
		
		System.out.println("e : " + key);
		
		int x = btn1.getX();
		int y = btn1.getY();
		
		if(key == 37) {
			x -= 10;
		}
		else if(key == 38) {
			y -= 10;
		}
		else if (key ==39) {
			x +=10;
		}
		else if(key ==40) {
			y +=10;
		}
		btn1.setLocation(x, y);
		
		if(key ==32) {
			for(int i =0 ;i<7;i++) {
				btn1.setLocation(btn1.getX()+10, btn1.getY()-10);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			/*for(int i =0;i<7;i++) {
				btn1.setLocation(btn1.getX()+5, btn1.getY()-5);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			for(int i =0;i<7;i++) {
				btn1.setLocation(btn1.getX()+5, btn1.getY()+5);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}*/
			for(int i =0;i<7;i++) {
			btn1.setLocation(btn1.getX()+10, btn1.getY()+10);	
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//누른 버튼 뗄 때
		
	}
}
