package exam_20180913;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 로봇을 만들자.
// 키보드 받아서 움직이고
// 스페이스는 점프

public class Q1 extends Frame implements KeyListener{
	private Button face;
	private Button body;
	private Button l_leg;
	private Button r_leg;
	private Button l_hand;
	private Button r_hand;	
	
	Q1(){
		setBounds(100,100,800,600);
		setVisible(true);
		setLayout(null);
		
		face = new Button("0 v 0");
		face.setBounds(100,200,50,50);
		
		body = new Button();
		body.setBounds(80,270,90,100);
		
		l_hand = new Button();
		l_hand.setBounds(40,270,30,100);
		
		r_hand = new Button();
		r_hand.setBounds(180,270,30,100);
		
		l_leg = new Button();
		l_leg.setBounds(80,380,30,100);
		
		r_leg = new Button();
		r_leg.setBounds(140,380,30,100);
		
		//add
		add(face);
		add(body);
		add(l_hand);
		add(r_hand);
		add(l_leg);
		add(r_leg);
		
		this.addKeyListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("종료");
				System.exit(0);
			}
		});
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//버튼 누를 때
				int key = e.getKeyCode();
				
				System.out.println("e : " + key);
				
				int x_f = face.getX();
				int y_f = face.getY();
				int x_l_l = l_leg.getX();
				int y_l_l = l_leg.getY();
				int x_r_l = r_leg.getX();
				int y_r_l = r_leg.getY();
				int x_l_h = l_hand.getX();
				int y_l_h = l_hand.getY();
				int x_r_h = r_hand.getX();
				int y_r_h = r_hand.getY();
				int x_b = body.getX();
				int y_b = body.getY();
				
				if(key == 37) {// 왼쪽
					x_f -=10;
					x_b -=10;
					x_l_l -=10;
					x_r_l -=10;
					x_l_h -=10;
					x_r_h -=10;
				}
				else if(key ==38) {//위
					y_f -=10;
					y_b -=10;
					y_l_l -=10;
					y_r_l -=10;
					y_l_h -=10;
					y_r_h -=10;
				}
				else if (key ==39) {//오른쪽
					x_f +=10;
					x_b +=10;
					x_l_l +=10;
					x_r_l +=10;
					x_l_h +=10;
					x_r_h +=10;
				}
				else if(key ==40) {//아래
					y_f +=10;
					y_b +=10;
					y_l_l +=10;
					y_r_l +=10;
					y_l_h +=10;
					y_r_h +=10;
				}				
				face.setLocation(x_f, y_f);
				body.setLocation(x_b, y_b);
				l_leg.setLocation(x_l_l, y_l_l);
				r_leg.setLocation(x_r_l,y_r_l);
				l_hand.setLocation(x_l_h,y_l_h);
				r_hand.setLocation(x_r_h, y_r_h);
				
			
				if(key ==32) {
					for(int i =0 ;i<7;i++) {
						face.setLocation(face.getX()+10, face.getY()-10);
						body.setLocation(body.getX()+10, body.getY()-10);
						l_leg.setLocation(l_leg.getX()+10, l_leg.getY()-10);
						r_leg.setLocation(r_leg.getX()+10, r_leg.getY()-10);
						l_hand.setLocation(l_hand.getX()+10, l_hand.getY()-10);
						r_hand.setLocation(r_hand.getX()+10, r_hand.getY()-10);
						try {
							Thread.sleep(50);
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				for(int i =0;i<7;i++) {
					face.setLocation(face.getX()+10, face.getY()+10);
					body.setLocation(body.getX()+10, body.getY()+10);
					l_leg.setLocation(l_leg.getX()+10, l_leg.getY()+10);
					r_leg.setLocation(r_leg.getX()+10, r_leg.getY()+10);
					l_hand.setLocation(l_hand.getX()+10, l_hand.getY()+10);
					r_hand.setLocation(r_hand.getX()+10, r_hand.getY()+10);	
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
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new Q1();
	}

}
