package d20180911;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTEx04 extends Frame{
	
	Button btn1,btn2,btn3,btn4,btn5;
	
	AWTEx04(){
		super("Flow Layout");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		FlowLayout fl = new FlowLayout();//border이던게 flow로 바뀜
		setLayout(fl);
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new AWTEx04();
	}
}
