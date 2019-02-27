package d20180912;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//마우스로 버튼을 잡으러 가기 

public class MovingButton extends Frame implements MouseMotionListener,KeyListener{

	private Button btn1;
	private Label lb;
	
	
	public MovingButton() {
		setBounds(100,100,600,400);
		setLayout(null);
		setVisible(true);
		
		btn1 = new Button("^<^");
		lb = new Label("Catch me if you can...");
		
		btn1.setBounds(80,60,80,60);
		lb.setBounds(100,200,200,40);

		add(btn1);
		add(lb);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
	
	}//생성자 end
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//현재 버튼의 x,y 좌표
		int bx = btn1.getX();
		int by = btn1.getY();
		
		//마우스의 x,y 좌표
		int x = e.getX();
		int y = e.getY();
		
		System.out.println(" x "+x+" y "+y);
		//거리구하기 a^2+b^2 = c^2 (피타고라스)
		
		//버튼 기준 -> 중앙 좌표
		bx +=40;
		by +=30;
		
		double dis = Math.sqrt((bx-x)*(bx-x)+(by-y)*(by-y));//제곱근 구하는 sqrt
		//sqrt - double 이고 , ()안은 모두 정보가 int로 되어있다. => double이 더 크니까
		//자동 형변환(double이 더 크기 때문)
		
		/*if(dis<90) {
			System.out.println("거의 가까이 옴");//기준을 중앙으로 해놔야 한다.. (이건 아직 적용x)
		}else {
			System.out.println("아직 멀다");
		}*/
		
		if(dis<90) {
			btn1.setLocation(
					(int)(Math.random()*600),
					(int)(Math.random()*400));
		}
	}
	public static void main(String[] args) {
		new MovingButton();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("잡으셨습니다!");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
