package study;

public class Buble {
	public static void main(String[] args) {
		
		int[] num = {9,4,5,6,1,2,3,8,7};
		int max = 0;
		int temp = 0;
		int index = 0;
		//역순정렬
		
		//선택
		for(int i = 0;i<num.length-1;i++) {
			max = num[i];
			for(int j = i+1;j<num.length;j++) {
				if(max<num[j]) {
					max = num[j];
					index = j;
				}
			}
			if(max == num[i]) index = i;
			temp = num[i];
			num[i] = num[index];
			num[index] = temp;
		}
		
		System.out.println("선택정렬");
		for(int i = 0;i<num.length;i++) {
			System.out.print(num[i]+"  ");
		}
		
		//버블
		
		
		for(int i = 0;i<num.length-1;i++) {
			for(int j = i;j<num.length-1;j++) {
				if(num[j]<num[j+1]) { //1,2 = >2,1
					temp=num[j];
					num[j] = num[j+1];
					num[j+1] =num[j];
				}
			}
		}
		System.out.println();
		System.out.println("버블정렬");
		
		for(int i = 0;i<num.length;i++) {
			System.out.print(num[i]+"  ");
		}
		
		//선택 오름차순
		
		for(int i = 0;i<num.length-1;i++) {
			int min = i;
			for(int j = i+1;j<num.length;j++) {
				if(num[min]>num[j]) {
					min = j;
				}
				temp = num[min];
				num[min] = num[i];
				num[i]= temp;
			}
		}
		
		System.out.println();
		System.out.println("선택정렬 - 오름차순");
		for(int i : num) {
			System.out.print(i+"  ");
		}
		
		//버블 오름차순 
		
		for(int i = 0;i<num.length-1;i++) {
			for(int j = i+1;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j]= temp;
				}
			}
		}
		System.out.println();
		System.out.println("버블정렬 - 오름차순");
		for(int i : num) {
			System.out.print(i+"  ");
		}
		//삽입정렬 - 역순
		int[] num2 = {9,4,5,6,1,2,3,8,7};
		int select,j;
		
		/*for(int i = 1 ; i < num2.length ; i ++) {
			b = num2[i];
			for(j = i-1 ; j >= 0 && num2[j] > b; j --) {
				num2[j+1] = num2[j];
			}
			num2[j+1] = b;
		}*/
		
		for(int i =1;i<num2.length;i++) {
			select = num2[i];
			for(j=i-1;j>=0;j--) {
				if( num2[j] > select) {
					num2[j+1]=num2[j];
				}else break;
			}
			num2[j+1] = select;
		}
		
		System.out.println();
		System.out.println("삽입정렬 - 오름차순");
		for(int i : num2) {
			System.out.print(i+"  ");
		}
			
	}
	
}
