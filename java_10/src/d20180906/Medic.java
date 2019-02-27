package d20180906;

public class Medic extends Teran {
	int 치료력, mp;
	
	Medic(){
		super();
		this.치료력 = 2;
		this.mp = 50;
	}
	
	void 치료하기(Teran t) {
		// 테란을 부모클래스로 하는 모든 자식 클래스를 치료할 수 있음
		t.hp += 치료력;
		this.mp -= 5;
		if(t.hp > 100) {
			t.hp = 100;
		}//if end
		System.out.println("치료 되었습니다.");
	}
}
