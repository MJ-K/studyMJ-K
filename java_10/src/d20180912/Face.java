package d20180912;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Face extends Frame{
	
	Face() {
		super("Face");
		/*setSize(800, 600);
		setLocation(100, 100);*/
		
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.out.println("종료합니다");
				System.exit(0);
			}
			/*public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}*/
		});
		
	}//생성자 end
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);//붓처럼 쓰는 것
		g.drawOval(200, 100, 400, 400);//원을 그린다 //얼굴
		g.drawOval(260, 210, 80, 80); //왼쪽 눈
		g.fillOval(270, 220, 60, 60); //왼쪽 동공
		
		g.drawOval(450, 210, 80, 80);//오른쪽 눈
		g.fillOval(460, 220, 60, 60);//오른쪽 동공
		
		g.fillRect(260, 170, 80, 30);//왼쪽 눈썹
		g.fillRect(450, 170, 80, 30);//오늘쪽 눈썹
		
		g.drawArc(320, 300, 150, 150, 0, -180);
	}
	
	public static void main(String[] args) {
		new Face();
	}
	
}
