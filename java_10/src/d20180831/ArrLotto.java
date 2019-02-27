package d20180831;

public class ArrLotto {
	public static void main(String[] args) {
		
		//1~45까지
		
		int[] rnd= {1,2,3,4,5,6,7,8,9,10,
					11,12,13,14,15,16,17,18,19,20,
					21,22,23,24,25,26,27,28,29,30,
					31,32,33,34,35,36,37,38,39,40,
					41,42,43,44,45};
		
		//System.out.println(Math.random());
		//0.0 < Math.random() < 1.0 : double type 값
		//0 < Math.random()*10 < 10.~~~ : double type 값
		//0 < Math.random()*45 < 45.~~~ : double type 값 
		//						=>44.29275~~~
		
		
		//정수값만 필요함
		//0 < (int)Math.random()*45 <45 : int type 값
		
		//System.out.println((int)Math.random()*45);
		
		for(int i=0; i<100; i++) {
			//System.out.println((int)Math.random()*45);
		}
		
		for(int i=0;i<1000;i++) {
			int first=(int)(Math.random()*45);//0~44 이걸 배열에 사용 rnd[first]
			int second = (int)(Math.random()*45);
			
			int temp=0;
			 
			temp = rnd[first];
			rnd[first]=rnd[second];
			rnd[second]=temp;

		}
		
		for(int i=0;i<6;i++) {
			System.out.print(rnd[i]+"\t");
		}
		
		//정렬 알고리즘
		
		
	/*	int[] num=new int[45];
		Random random=new Random();
		
		num[0]=random.nextInt(50)+1;
		for(int i=1;i<45;i++) {
			num[i]=random.nextInt(50)+1;
		}
		
		for(int i=0;i<45;i++) {
			System.out.println(num[i]);
		}*/ //Random 함수 사용
		
	}
}
