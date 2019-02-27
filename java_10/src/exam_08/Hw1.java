package exam_08;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

//로또 만들기 
//버튼 누르면 숫자 6개 나오기

public class Hw1 extends Frame implements ActionListener{
	
	Button bt;
	
	public Hw1() {
		super("EVENT");
		setSize(400, 300);
		setLocation(600, 300);
		setVisible(true);
		
		bt= new Button("Lotto!");
		
		add(bt, "South");
		
		bt.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Lotto lt = new Lotto();
		lt.select();
        lt.print();
		
	}
	
	public static void main(String[] args) {
		new Hw1();
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
