package d20180904;

import java.util.Random;

//구구단 3단만 출력해 보세요 - OOP형태

public class GuGuDan {
	
	int num;
	
	 public GuGuDan(){
		Random r = new Random();
		num = (r.nextInt(9)+1);
	}
	
	public void print() {
		
		for(int i=1;i<10;i++) {
			System.out.println(num +" * "+ i +" = "+ (num*i));
		}
	}
	
	public static void main(String[] args) {
		GuGuDan g = new GuGuDan();
		g.print();
	}
}
