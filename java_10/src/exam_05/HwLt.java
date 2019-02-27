package exam_05;

import java.util.Arrays;

public class HwLt {
	  public static void main(String[] args){
          // 3 일때 3개 출력 , 5일때는 5개 출력
          Lotto lt = new Lotto();
          lt.select();
          lt.print();
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