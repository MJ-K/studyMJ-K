package exam_03;

public class HwNo2 {
	public static void main(String[] args) {
		//2~3 .  아래의 데이터를 정렬시키는 코드를 작성하시오. (두 가지 이상의 정렬 알고리즘을 사용 하세요 )
		// 위키피디아 검색해서 공부해오시면 됩니다. ^^
		// - 선택 정렬
		// - 나머지 하나 

		
		int[] data  = { 100,20,5,2,3,34,65,23,66,200};
		int temp=0;
		int min=0;//가장 작은 수 
		
		//1. 선택 정렬
/*		for(int i=0;i<9;i++) {
				min=i;
			for(int j=i+1;j<10;j++) {
				if(data[min]>data[j]) {
					min = j;
				}
				temp=data[i];
				data[i]=data[min];
				data[min]=temp;
			}
		}*/
		
		for(int i=0; i<data.length-1; i++) { // data.length-1 : 마지막 요소는 자연스럽게 정렬됨
			min = i;
			for(int j=i+1; j<data.length; j++) {
				if(data[min] > data[j]) {
					min = j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		
		System.out.println("\n1. 선택정렬로 정렬 된 모습 : \n");
		
		for(int i=0;i<10;i++) {
			System.out.print(data[i]+"  ");
		}
		
	
	}
}
