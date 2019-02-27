package exam_08;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//next와 exit 버튼
//next는 누를때마다 빨 노 초 순서대로 나오도록한다 (빨->노->초->빨..)
//EXIT는 나가도록

public class Hw3 extends Frame implements ActionListener{
	
	Button next;
	Button exit;
	int num;
	
	public Hw3() {
		super("EVENT");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		setLayout(null);
		
		num = 1;
		next = new Button("NEXT");
		exit = new Button("EXIT");
		
		next.setSize(200, 50);
		next.setLocation(0, 245);
		exit.setSize(200, 50);
		exit.setLocation(200, 245);
		
		//Handler_next hd_n = new Handler_next();
		Handler_exit hd_e = new Handler_exit();
		next.addActionListener(this);
		exit.addActionListener(hd_e);
		
		add(exit);
		add(next);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Object obj = e.getSource();
		switch(num) {
		case 1 :
			setBackground(Color.RED);
			break;
		case 2 : 
			setBackground(Color.YELLOW);
			break;
		case 3 :
			setBackground(Color.GREEN);
			num=0;
			break;
		}
		num++;
	}
		
		
	public static void main(String[] args) {
		new Hw3();
	}
}

/*class Handler_next implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Hw3 hw3 = new Hw3();
		Object obj = e.getSource();
		if(obj==hw3.next) {
			switch(hw3.num) {
			case 1 :
				hw3.setBackground(Color.RED);
				break;
			case 2 : 
				hw3.setBackground(Color.YELLOW);
				break;
			case 3 :
				hw3.setBackground(Color.GREEN);
				break;
			}
			hw3.num++;
		}
		
		
	}
	
}*/
class Handler_exit implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}