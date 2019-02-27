package exam_08;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//구구단 버튼 누르면 
//랜덤하게 한 단이 나오도록한다.

public class Hw2 extends Frame implements ActionListener{
		
	Button bt;
	
	public Hw2() {
		super("EVENT");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		bt = new Button("GuGuDan");
		
		add(bt,"South");
		
		bt.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//구구단 
		int num;
		
		num = (int)(Math.random()*9)+1;
		
		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+ (num*i));
		}
		
	}
	public static void main(String[] args) {
		new Hw2();
	}
}
