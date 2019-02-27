package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//container : 다른 component들을 담을 수 있는 component

public class AWTEx02 extends Frame{
	
	Button btn;

	AWTEx02(String title){
	
		super(title);
		//사이즈 400, 200
		setSize(400,200);
		//위치 597 , 289
		setLocation(597,289);
		
		//버튼 추가
		btn = new Button("hello");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		//컨테이너에 컴포넌트를 담아야 쓸 수 있음
		add(btn);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
		//setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		AWTEx02 aw = new AWTEx02("버튼이 있는 윈도우");
	}
}
