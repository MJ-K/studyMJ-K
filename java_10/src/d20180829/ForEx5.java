package d20180829;

public class ForEx5 {
	public static void main(String[] args) {
		
		
		/*다음 식을 만족하는 모든 A와 B의 조합을 출력하세요
		 * 
		 * 			A		B
		 * 		+	B		A
		 * ------------------------------
		 * 			9		9
		 * 
		 * */
		// original
		for(int i=0;i<10;i++) {
			for(int j=9;j>=0;j--) {
				if((i+j)==9) {
						if(i==0) {
							System.out.println(" \t"+" "+(i*10+j)+"\n"+"+\t"+(j*10+i)+"\n"+"----------------"+"\n"+" \t"+((i*10+j)+(j*10+i)));
						}
						else if(j==0) {
							System.out.println(" \t"+(i*10+j)+"\n"+"+\t"+" "+(j*10+i)+"\n"+"----------------"+"\n"+" \t"+((i*10+j)+(j*10+i)));
						}else {
							System.out.println(" \t"+(i*10+j)+"\n"+"+\t"+(j*10+i)+"\n"+"----------------"+"\n"+" \t"+((i*10+j)+(j*10+i)));
						}
						System.out.println();
						System.out.println();
				}
			}
			
		}
		//////////////////////////////////////////////////break문 사용
		/*int k;
		for(int i=0;i<10;i++) {
			for(k=9;k>=0;k--) {
				if((i+k)==9) break;
			}
			if(i==0) {
				System.out.println(" \t"+" "+(i*10+k)+"\n"+"+\t"+(k*10+i)+"\n"+"----------------"+"\n"+" \t"+((i*10+k)+(k*10+i)));
			}
			else if(k==0) {
				System.out.println(" \t"+(i*10+k)+"\n"+"+\t"+" "+(k*10+i)+"\n"+"----------------"+"\n"+" \t"+((i*10+k)+(k*10+i)));
			}else {
				System.out.println(" \t"+(i*10+k)+"\n"+"+\t"+(k*10+i)+"\n"+"----------------"+"\n"+" \t"+((i*10+k)+(k*10+i)));
			}
			System.out.println();
			System.out.println();
		}*/
//////////////////////////////////////////////////break문 사용2
		/*for(int i=9;i>=10;i--) {
			for(int j=0;j<10;j++) {
				if((i+j)==9) break;
				if(i==0) {
					System.out.println(" \t"+" "+(j*10+i)+"\n"+"+\t"+(i*10+j)+"\n"+"----------------"+"\n"+" \t"+((i*10+j)+(j*10+i)));
				}
				else if(j==0) {
					System.out.println(" \t"+(j*10+i)+"\n"+"+\t"+" "+(i*10+j)+"\n"+"----------------"+"\n"+" \t"+((i*10+j)+(j*10+i)));
				}else {
					System.out.println(" \t"+(j*10+i)+"\n"+"+\t"+(i*10+j)+"\n"+"----------------"+"\n"+" \t"+((i*10+j)+(j*10+i)));
				}
				System.out.println();
				System.out.println();
			}
			
		}*/

	}
}