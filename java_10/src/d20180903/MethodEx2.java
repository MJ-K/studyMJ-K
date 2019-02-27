package d20180903;
//1. 두 개의 정수를 전달받기 - 세 번 메소드 호출 
//2. 두 수 차의 절대값을 계산하여 출력하세요(메소드)

public class MethodEx2 {
	
	void absolute_value(int x,int y) {
		int res=0;
		
		if(x>y) {
			res= x-y;
		}
		else {
			res =y-x;
		}//if end
		System.out.println("| "+x+" - "+y+" |" +" = "+ res);
	}//absolute_value() end
	
	public static void main(String[] args) {
		MethodEx2 m2=new MethodEx2();
		m2.absolute_value(2, 3);
		m2.absolute_value(3, 7);
		m2.absolute_value(4, 9);
	}

}
