package d20180911;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

//Layout Manger : 배치 관리자
//컨테이너에는 컴포넌트를 어떻게 배치할 지 도와주는 배치관리자가 있음
//Frmae을 상속받으면 기본적으로 Border Layout 사용


//Border Layout
public class AWTEx03 extends Frame{
	
	Button btn1, btn2, btn3, btn4, btn5;
	
	AWTEx03(){
		super("button5");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		add(btn1, bl.EAST);
		add(btn2, bl.WEST);
		add(btn3, bl.SOUTH);
		add(btn4, bl.NORTH);
		add(btn5, bl.CENTER);
		//상대값으로 매치..bl.~~~
	}
	
	
	public static void main(String[] args) {
		new AWTEx03().setVisible(true);
		
	}
}
