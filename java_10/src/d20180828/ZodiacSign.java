package d20180828;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ZodiacSign {
	
	private static ArrayList<String> myArrayList;
	
	public static void main(String[] args) {
		
		System.out.println("태어난 년도 4자리 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		//자축인묘 진사오미 신유술해
		//쥐소호토 용뱀말양 원닭개돼
		
		//System.out.println(year);
		
		//콘솔에 당신은 ~~띠 입니다. 출력해보세요.
		
		int def = year%12;
		/*String arr[]= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼"};
		
		System.out.println("당신은 "+arr[def]+"띠 입니다.");
		*/
		
		
		
		/*if(def==1) {
			System.out.println("당신은 닭띠입니다.");
		}
		else if(def==2) {
			System.out.println("당신은 개띠입니다.");
		}
		else if(def==3) {
			System.out.println("당신은 돼지띠입니다.");
		}
		else if(def==4) {
			System.out.println("당신은 쥐띠입니다.");
		}
		else if(def==5) {
			System.out.println("당신은 소띠입니다.");
		}
		else if(def==6) {
			System.out.println("당신은 호랑이띠입니다.");
		}
		else if(def==7) {
			System.out.println("당신은 토끼띠입니다.");
		}
		else if(def==8) {
			System.out.println("당신은 용띠입니다.");
		}
		else if(def==9) {
			System.out.println("당신은 뱀띠입니다.");
		}
		else if(def==10) {
			System.out.println("당신은 말띠입니다.");
		}
		else if(def==11) {
			System.out.println("당신은 양띠입니다.");
		}
		else if(def==0) {
			System.out.println("당신은 원숭이띠입니다.");
		}*/

		myArrayList = new ArrayList<String>(
		Arrays.asList("원숭이","닭","개","돼지","쥐","소","호랑이","토끼"));
		/*myArrayList.add("원숭이");
		myArrayList.add("닭");
		myArrayList.add("개");
		myArrayList.add("돼지");
		myArrayList.add("쥐");
		myArrayList.add("소");
		myArrayList.add("호랑이");
		myArrayList.add("토끼");
		myArrayList.add("용");
		myArrayList.add("뱀");
		myArrayList.add("말");
		myArrayList.add("양");*/
		
		System.out.println("당신은 "+myArrayList.get(def)+"띠 입니다.");
	}
}
