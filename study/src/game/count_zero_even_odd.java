package game;

import java.util.ArrayList;
import java.util.Scanner;

public class count_zero_even_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "Y";
		int usernum  = 0;
		int remain = 0;
		
		int zero = 0;
		int odd = 0;
		int even = 0;
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		
		System.out.println( "15054007 �����" );
		
		while(true) {
			
			
			
			System.out.println("���� ������ �Է����ּ��� :");
			usernum = sc.nextInt();
			
			if(usernum <0) continue;//���� ������ �ƴϸ� continue;
			
			while(true) {
				
				remain = usernum %10;
				usernum /= 10;
				
				if(remain==0) {
					zero++;
				}else if(remain%2==0) {
					even++;
				}else {
					odd++;
				}
				
				if(usernum == 0) break;
				
			}
			
			System.out.println("���  ");
			System.out.println("���� : "+zero+" ��");
			System.out.println("¦�� : "+even+" ��"); 
			System.out.println("Ȧ�� : "+odd+" ��");
			
			System.out.println("�ٸ� ���� �Ͻðڽ��ϱ�?(Y/N)");
			
			input = sc.next();
			
		
			if(input.equals("y")||input.equals("n")||input.equals("Y")||input.equals("N")) {
				if(input.equals("n")||input.equals("N")) {
					System.out.println("������ �����ϰڽ��ϴ�.");
					break;
					
				}
				if(input.equals("y")) {
					input=input.replace("y", "Y");
				}
			}else {
				System.out.println("�߸� �� �Է��Դϴ� ������ �����ϰڽ��ϴ�.");
				System.exit(0);
				//break;
			}
			
		}
		
		
	}
}
