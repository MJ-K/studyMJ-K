package d20180904;

public class Rabbit {
	String eye;
	String hair;
	int ear;
	int leg;
	
	Rabbit(){
		eye="red";
		hair="white";
		ear=2;
		leg=4;
	}

	void 점프하기() {
		System.out.println("깡총깡총");
	}
	
	void eat() {
		System.out.println("아작아작");
	}
	
	//생성자
	public static void main(String[] args) {
		Rabbit rb = new Rabbit();
		rb.eat();
		System.out.println(rb.ear);
	}
}
