package problem01;

public class Main {
	public static void main(String[] args) {
		//int[] arr = { -10, -3, 5, 6, -20 };
		int[] arr = {-10,2,0};
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		int max_i=0;
		int max_j=0;
		int max=arr[0]*arr[1];
		
		for(int i =0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(max<arr[i]*arr[j]) {
					max=arr[i]*arr[j];
					max_i=i;
					max_j=j;
				}
			}
		}
		System.out.println("["+arr[max_i]+","+arr[max_j]+"]");
	}
}
