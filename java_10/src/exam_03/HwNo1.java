package exam_03;

public class HwNo1 {
	public static void main(String[] args) {
		//1.score 배열에 국어 , 영어 , 수학 점수가 들어있다.
		//총점과 평균을 계산해서 배열에 담은 후 모든
		//학생의 국어, 영어, 수학, 총점, 평균을 출력하시오
		//참고) 배열에는 국어, 영어 수학 점수만 들어있다.

		int[][] score = {
		     {80,80,80,0,0},
		     {60,50,80,0,0},
		     {50,90,90,0,0},
		     {40,50,60,0,0},
		     {90,90,95,0,0},
		     {85,95,100,0,0},
		};

		int[] sum = new int[6];
		double[] avg = new double[6];
		
		for(int i=0;i<6;i++) {
			System.out.print((i+1)+" 번째 학생 평균 : ");
			for(int j=0;j<3;j++) {
				sum[i]+=score[i][j];
			}
			avg[i]=sum[i]/3.0;
			System.out.println(Double.parseDouble(String.format("%.1f",avg[i]))+" ");
		}
		

		for(int i=0;i<6;i++) {
			score[i][3]=sum[i];
			score[i][4]=(int)avg[i];
		}

		System.out.println("\n\n");
		for(int i=0;i<6;i++) {
			System.out.println((i+1)+" 번째 학생 :   국어\t\t수학\t\t영어\t\t총점\t\t평균");
			for(int j=0;j<5;j++) {
				System.out.print("\t\t"+score[i][j]);
			}
			System.out.println("\n\n");
		}
	}
}
