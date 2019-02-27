package d20180911;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//AWT : Abstract Window Toolkit

//component : 윈도우 상의 모든 구성요소


public class AWTEx01 extends Frame{
	
	AWTEx01(String title){
		super(title);//AWT에서 제공해주는 FRAME 메소드 오버로드
		//창 크리 : 300, 300
		setSize(300, 300);
		
		//창의 위치 : x, y -400, 200
		setLocation(400, 200);
	}
	public static void main(String[] args) {
		AWTEx01 aw = new AWTEx01("내가 처음 만든 윈도우");
		aw.setVisible(true);
		
		aw.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		//aw.setLayout(new FlowLayout());
	}
}
