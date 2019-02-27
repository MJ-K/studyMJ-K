package exam_08;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import d20180904.GuGuDan;

public class Q1 extends Frame implements ActionListener{
	Button btn1;
	
	public Q1() {
		super("GuGuDan");
		setSize(400,300);
		setLocation(600,300);
		setVisible(true);
		
		btn1= new Button("GuGuDan");
		add(btn1, "South");
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		btn1.addActionListener(this);
		
	}

	public static void main(String[] args) {
		new Q1();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		GuGuDan g = new GuGuDan();
		g.print();
	}
}
