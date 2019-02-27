package d20180911;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 처리
//1. 이벤트 소스 결정
//2. 이벤트 소스 감지기 부착
//3. 핸들러 작동


public class AWTEx07 extends Frame implements ActionListener{

	//핸들러 객체를 따로 만들 필요 없이 내 클래스에서 오버라이드 해서 쓰는게 더 편함
	//다만, 이벤트가 많거나 로직이 복잡해지면 핸들러 클래스를 따로 생성해서 
	// 분리하는 것이 더 바람직
	
	Button bt;
	
	public AWTEx07() {
		super("Action Test");
		setSize(300, 500);
		setLocation(500,300);
		
		bt = new Button("south");
		add(bt, "South");
		
		//감지기 부착
		bt.addActionListener(this);
		
		setVisible(true);
	}//생성자 end
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("안녕하세요");
	/*	System.out.println("e : "+e.getSource());
		System.exit(0);*/
		
		Object obj = e.getSource();
		if(obj == bt) {
			this.setBackground(Color.CYAN);
		}
	}
	
	public static void main(String[] args) {
		new AWTEx07();
	}
}//class end
