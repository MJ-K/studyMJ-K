package d20180905;

public class DataUse {
	public static void main(String[] args) {
		Data data = new Data();
		//data.name = "홍길동";
		//This field Data.name is not visible
		
		data.setName("홍길동");
		
		String name = data.getName();
		System.out.println(name);
		
		//연봉은 70000000
		
		data.setAnnual(70000000);
		
		//int annual = data.getAnnual();
		//System.out.println(annual);
		
		System.out.println(data.getAnnual());
	}
}
