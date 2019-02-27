package d20180906;
// 이 사람의 직업과 직책은 아는데... 이름도 알고 싶어요...
public class BusinessMan extends Man {
	String job;
	String position;	
	
	BusinessMan(String name, String job, String position){
		super(name);   // 상속받은 상위 클래스 생성자 호출
		this.job = job;
		this.position = position;
	}
	
	void tellInfo() {
		System.out.println("job is : "+ job);
		System.out.println("position is : "+ position);
		tellName();
	}
	
}
