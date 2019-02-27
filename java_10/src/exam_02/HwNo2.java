package exam_02;

public class HwNo2 {
		public static void main(String[] args) {
		
			//2. 1부터 100사이의 정수 중 2 또는 3의 배수가 아닌 수의 합계를 구하시오.	
		
			//for문으로 1~100사이의 정수를 돌리고 그 안에서 if 문을 통해 2또는 3의배수(%이용)
			//를 찾아내어(2의 배수도 아니고 3의 배수도 아닌 것) 합을 구한다.
			
			int sum=0;
			
			for(int i=0;i<=100;i++) {
				if((i%2!=0)&&(i%3!=0)) {
					sum += i;
				}
			}
			System.out.println(sum);
		}
	}
