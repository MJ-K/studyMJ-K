package d20180829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//사용자로부터 숫자를 하나 입력받아 해당 구구단
//출력해보세요.

public class ForEx1 {
	public static void main(String[] args) {
		
		int num;
		int res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 하나 입력받아 주세요 : ");
		num = sc.nextInt(); //숫자 입력
		
		for(int i = 1 ; i<10 ; i++) {//구구단은 1부터 시작한다. 그리고 1-9 숫자들을 사용한다.
			
			res = num * i; 
			System.out.println(num + " * " + i + " = " + res); // 3 * 2 = 6 형식으로 출력
			
		}
	}
	
	/*public static void main(String[] args)  {
		int num = 1;
		int res = 0;
		
		Scanner sc= new Scanner(System.in);
		num = sc.nextInt();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		
		try {
			num = Integer.parseInt(bf.readLine());
			for(int i = 1;i<10;i++) {
				res = num *i;
				//System.out.println(res);
			}
			
			pw.write(String.valueOf(res));
			pw.flush();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bf.close();
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}*/
	
	/*public static void main(String[] args) {
		
		int num;
		int res;
		
		System.out.println("숫자를 하나 입력받아 주세요 : ");
		try {
			num = System.in.read()-48; //아스키코드로나온다,,,
			for(int i = 1 ; i<10 ; i++) {//구구단은 1부터 시작한다. 그리고 1-9 숫자들을 사용한다.
				
				res = num * i; 
				System.out.println(num + " * " + i + " = " + res); // 3 * 2 = 6 형식으로 출력
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	*/
}
