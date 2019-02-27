package d20180910;

public class 광선검 implements Weapon{
	
	int 고출력에너지;
	int 내구도;
	
	String 레이저색;
	
	광선검(){
		this.고출력에너지 = 300;
		this.내구도 = 100;
		레이저색="white";
	}
	
	광선검(String color){
		this.레이저색 = color;
	}
	
	광선검(int m_고출력에너지){
		this.고출력에너지 = m_고출력에너지;
	}
	
	public void 충전() {
		this.고출력에너지 = 300;
	}
	
	
	@Override
	public void attack() {
		System.out.println("위잉위잉");
		고출력에너지 -=10;
		내구도 -=10;
	}

	@Override
	public void repair() {
		System.out.println("수리 완료~");
		내구도 = 100;
	}

	@Override
	public void upgarde() {
		System.out.println("무기를 업그레이드 했습니다!");
		내구도 = 150;
		고출력에너지 = 300;
	}
}
