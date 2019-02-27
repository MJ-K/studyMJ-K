package d20180906;

public class Animal {
	String name;
	String food;
	
	Animal(String name, String food){
		this.name = name;
		this.food = food;
	}	
	
	void eat() {
		// 이름을 가진 동물이 어떤 음식을 먹는다
		System.out.println(this.name +  " 가 "+ this.food + "를/을 먹는다.");
	}
	
	void walking(String str) {
		 System.out.println(this.name + " 가 " + str + " 걷는다");
	}
	
	void breath() {
		System.out.println("호흡한다");
	}
}
