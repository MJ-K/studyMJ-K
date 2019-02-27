package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//이벤트
// 1. 이벤트 소스 결정
// 2. 이벤트 감지기 설치  ex) 화재 감지기
// 3. 핸들러 동작		  ex) 스프링 쿨러 동작  //이벤트
// 개발자는 보통 1,3,2 순으로 처리

public class AWTEx05 extends Frame{
	
	Button btnYes,btnNo;

	AWTEx05(){
		super("EVENT");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		//기본 배치 관리자를 사용하지 않기
		//즉, border 끄겠다. 원하는대로 바꾸겠다는 뜻
		
		setLayout(null);
		
		btnYes = new Button("YES");
		btnNo = new Button("NO");
		
		//배치 관리자가 없어지면 모든 컴포넌트는 각각의 크기와 위치 지정 가능
		btnYes.setSize(50,20);
		btnYes.setLocation(30, 60);
		
		btnNo.setSize(50,20);
		btnNo.setLocation(100, 60);
		
		
		add(btnYes);
		add(btnNo);
		
		//자바 감지기 : add ~~~~~ Listener
		Handler hd = new Handler();
		btnYes.addActionListener(hd);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		//FlowLayout fl = new FlowLayout();
		//setLayout(fl);
		
	}// 생성자 end
	
	public static void main(String[] args) {
		new AWTEx05();
	}
}//class end

class Handler implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("why click me?");
	}
	
	
}
