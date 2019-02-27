package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount=amount;
	}

	public Money add(Money money) {
		
		return new Money(money.amount+ amount);
	}

	public Money minus(Money money) {
		return new Money(amount- money.amount);
	}

	public Money multiply(Money money) {
		return new Money(money.amount* amount);
	}

	public Money devide(Money money) {
		return new Money(amount/ money.amount);
	}

	public int getAmount() {
		return amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj ==null) return false;
		if(this.getClass() != obj.getClass()) return false;
		if(this==obj) return true;
		 Money that = (Money) obj;

	     if (this.amount == that.amount) return true;

	        return false;
	}
	
	@Override
	public int hashCode() {
		 
		final int prime= 31;
		int hashcode = 1;
		
		hashcode = prime * hashcode + ((amount == 0) ? 0 : this.amount);

		return hashcode;
	}
	
}