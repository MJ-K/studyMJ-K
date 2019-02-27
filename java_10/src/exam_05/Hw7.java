package exam_05;

public class Hw7 {
	 public static void main(String[] args){
	        Animal a1 = new Animal("원숭이",26);
	        a1.setName("개코원숭이");
	        a1.show();
	 }
	

}

class Animal{
    String name;
    int age;
    
    Animal(String name, int age){
    	this.name = name;
    	this.age = age;
    }
    
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void show(){
        System.out.println( name + "님은 " + age + "살 입니다");
    }

 }
