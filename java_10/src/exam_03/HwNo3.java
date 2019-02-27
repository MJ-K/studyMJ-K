package exam_03;

public class HwNo3 {
	public static void main(String[] args) {

		int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		int temp=0;
		
		//2.버블정렬
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				
				if(data[j]>data[j+1]) {
					
					temp =data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
					
				}
			}for(int k=0;k<10;k++) {
				System.out.print(data[k]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n2. 버블정렬로 정렬 된 모습 : \n");
		
		for(int i=0;i<10;i++) {
			System.out.print(data[i]+"  ");
		}
		
	}
}
