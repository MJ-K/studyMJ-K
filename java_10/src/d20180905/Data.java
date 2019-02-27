package d20180905;
//캡슐화
public class Data {
	//멤버 변수 - private
	private String name = "";
	private int annnual = 0;
	
	//setter : 멤버 변수에 값을 지정(set으로 시작하면 데이터를 전달하는구나 라고 이해)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnnual(int annual) {
		this.annnual = annual;
	}
	
	//getter : 멤버 변수에 접근해서 멤버 변수의 값을 가져오는 메소드(CRUD의 기초 (생성 수정 조회 삭제))
	public String getName() {
		
		return "*" + this.name + "*";
	}
	
	//연봉 5% 인상해서 출력해보세요
	public int getAnnual() {
		
		return (int)(this.annnual*1.05);
	}
	
	public String getAnnual2() {
		
		return "\n"+(int)(this.annnual*1.05);
	}
}
