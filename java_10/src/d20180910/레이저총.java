package d20180910;

public class 레이저총 implements Weapon{
	
	
	int energy;

	
	레이저총(){
		this.energy= 200;
	}

	public void 충전() {
		this.energy = 200;
	}
	
	@Override
	public void attack() {
		System.out.println("치지직~~~~");
		energy -= 20;
	}

	@Override
	public void repair() {
		System.out.println("뚝딱 뚝딱");
		
	}

	@Override
	public void upgarde() {
		System.out.println("오~~~멋져짐");
	}
	
	
	
	
}
