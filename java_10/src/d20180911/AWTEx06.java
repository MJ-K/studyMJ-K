package d20180911;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//버튼1개만들고
//버튼을 south 배치해부세요

public class AWTEx06 extends Frame{
	Button bt;
	
	AWTEx06(){
		super("버튼 south 배치");
		setSize(300, 500);
		setLocation(500,300);
	//	setLayout(null);
		
	//	FlowLayout fl = new FlowLayout();
	//	setLayout(fl);
		bt = new Button("south");
		add(bt, "South");
		
		Handler1 hd1 = new Handler1();
		bt.addActionListener(hd1);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		
		new AWTEx06();
	}
}

class Handler1 implements ActionListener{//주인보다 앞서면 안되서 public 안됨

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("안녕하세요");
		System.exit(0);
	}//0 : 정상종료
	// 0 이외의 값 : 비정상 종료
	
}
