package d20180906;
/*
 *  고양이와 강아지의 공통특성을 추출하여 동물이라는 클래스를 만들고
 *  고양이와 강아지에게 상속하기로 했다
 *  
 *  출력 -------------------
 *  (고양이 이름)는 물고기를 먹는다. 살금살금 걷는다. (이름)이 있다. 호흡한다
 *  (강아지 이름)는 사료를 먹는다. 터벅터벅 걷는다. (이름)이 있다. 호흡한다
 *  
 *  변수 : name, food
 *  함수 : eat(), walking(), breath()
 */
public class ExtendsMain3 {
	public static void main(String[] args) {
		Cat cat = new Cat("야옹이", "물고기");
		cat.eat();
		cat.walking("살금살금");
		cat.breath();
		
		System.out.println("--------------------------------------------");
		
		Dog dog = new Dog("댕댕이", "사료");
		dog.eat();
		dog.walking("터벅터벅");
		dog.breath();
		
		
	}
}
