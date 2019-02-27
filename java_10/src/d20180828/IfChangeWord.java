package d20180828;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class IfChangeWord {
	public static void main(String[] args)throws IOException {
		
		/*System.out.println("문자 입력 : ");
		int value = System.in.read();//숫자로 밖에 받지 못함, 한 글자만 인식
		System.out.println(value);*/
		
		//사용자로부터 문자 한 자를 입력받은 후, 소문자는 대문자로 , 대문자는 소문자로 변환시켜보세요.
		
		System.out.println("문자 입력 : ");
		int value = System.in.read();//A=65- Z =90 ,a=97- z:122
		System.out.println("처음 입력값 : "+value);
		
		/*if(value<97) {
			
			value += 32;
		}
		else
		{
			value -= 32;
		}*/
		int dif= 'a'-'A';
	
		if(value<'a') {
			
			value += dif;
			
		}
		else
		{
			value -= dif;
		}
		System.out.println("변환된 값 " + value);
		System.out.println("결과 :" +(char)value);
	}
}
