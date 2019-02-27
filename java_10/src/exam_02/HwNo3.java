package exam_02;

public class HwNo3 {
	public static void main(String[] args) {
		
		
		//3. 두개 주사위를 던졌을때 합이 4가 되는 모든 경우의수를 출력하는 프로그램을 작성하시오.
		
		//dice1 , dice2를 던져 dice1 + dice2 = 4인 경우를 출력해야한다.
		//주사위는 1~6까지의 수를 가질 수 있으므로 for 중첩문으로 나올 수 있는 조합을 구현하고,
		//if문을 활용해 dice1(i) + dice2(j) = 4인 경우를 전부 보여준다.
		
		System.out.println("두개 주사위를 던졌을때 합이 4가 되는 모든 경우의수 : ");
		
		for(int i=1; i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if((i+j)==4) {
					System.out.println("("+i+" + "+j+")"+" = "+(i+j));
				}
			}
		}
	}
}
