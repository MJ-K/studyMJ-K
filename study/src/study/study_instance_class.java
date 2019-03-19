package study;

public class study_instance_class { 
	long a, b; //인스턴스 변수 a, b만을 이용해 작업하므로 매개변수가 필요 없다 
	long add() { return a+b; } //a, b는 인스턴스 변수
	//인스턴스 변수와 관계 없이 매개변수만으로 작업이 가능하다 
	static long add(long a, long b) { return a+b; } 
	//a, b는 지역 변수 
}

class  MyMath{
	public static void main(String[] args) { 
		//클래스 메서드 호출

		System.out.println(study_instance_class.add(200L, 100L)); 
		//300 
		
		//인스턴스 메서드는 객체 생성 후에만 호출 가능 
		study_instance_class mm = new study_instance_class();
		mm.a = 200L; 
		mm.b = 100L; 
		System.out.println(mm.add()); 
		} 
}

