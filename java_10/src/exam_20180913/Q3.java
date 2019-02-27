package exam_20180913;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;

//로또 버튼
//6개의 TEXTFILED로 6개의 숫자가 콘솔이 아닌 창에 뜨게 한다.(혹은 LABEL)

public class Q3 extends Frame implements ActionListener{
	
	private Button lotto_Btn;
	private Label lb1;
	private Label lb2;
	private Label lb3;
	private Label lb4;
	private Label lb5;
	private Label lb6;
	private Label lb7;
	private BufferedImage img = null;
	
	Q3() throws IOException {
		setBounds(600, 300, 400, 300);
		setLayout(null);
		setVisible(true);
		
		lotto_Btn = new Button("Lotto!!");
		lb1 = new Label();
		lb2 = new Label();
		lb3 = new Label();
		lb4 = new Label();
		lb5 = new Label();
		lb6 = new Label();
		img = ImageIO.read(new File("C:\\Users\\soldesk\\lotto.jpg"));
		
		//label 위치
		lb1.setBounds(70,200,20,20);
		lb2.setBounds(120,200,20,20);
		lb3.setBounds(170,200,20,20);
		lb4.setBounds(220,200,20,20);
		lb5.setBounds(270,200,20,20);		
		lb6.setBounds(320,200,20,20);	
		
		//버튼 위치+ 사이즈
		lotto_Btn.setBounds(0, 250,400, 50);
		
		// add
		add(lotto_Btn);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(lb5);
		add(lb6);
		
		
		//x닫기
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		lotto_Btn.addActionListener(this);
	}
	
	/*@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawImage(img, 0, 0, this);
	}*/
	
	public static void main(String[] args) throws IOException {
		new Q3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//6개의 TEXTFILED로 6개의 숫자가 콘솔이 아닌 창에 뜨게 한다.(혹은 LABEL)
		Lotto lotto = new Lotto();
		lotto.select();

		lb1.setText(Integer.toString(lotto.data[0]));
		lb2.setText(Integer.toString(lotto.data[1]));
		lb3.setText(Integer.toString(lotto.data[2]));
		lb4.setText(Integer.toString(lotto.data[3]));
		lb5.setText(Integer.toString(lotto.data[4]));
		lb6.setText(Integer.toString(lotto.data[5]));
	}
}

class Lotto{
	int[] rnd= {1,2,3,4,5,6,7,8,9,10,
			11,12,13,14,15,16,17,18,19,20,
			21,22,23,24,25,26,27,28,29,30,
			31,32,33,34,35,36,37,38,39,40,
			41,42,43,44,45};
	
	int[] data = new int[6];
	int num = 0;

	void select() {
		for(int i=0;i<1000;i++) {
			int first=(int)(Math.random()*45);//0~44 이걸 배열에 사용 rnd[first]
			int second = (int)(Math.random()*45);
			
			int temp=0;
			 
			temp = rnd[first];
			rnd[first]=rnd[second];
			rnd[second]=temp;

		}//중복제거 하면서 맞바꾸기
		
		for(int i=0;i<6;i++) {
			data[i] = rnd[i];
		}
		
		Arrays.sort(data);//정렬 소트 
	}
	
	void print() {
		for(int i=0 ;i<6 ;i++) {
			System.out.print(data[i]+"\t");
		}
	}//2차배열에서 print해볼것
}
