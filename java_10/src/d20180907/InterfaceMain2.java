package d20180907;

public class InterfaceMain2 {
	public static void main(String[] args) {
		InterfaceClass ifc = new InterfaceClass();
		ifc.calculate();
		ifc.getStr();
		System.out.println(ifc.STR);
		
		System.out.println();
		// 인터페이스도 간접적인 상속: has-a 관계
		// 간접상속이므로 부모-자식 관계처럼 성립
		
		InterfaceEx1 ife1 = new InterfaceClass();
		ife1.calculate();
		
		InterfaceEx2 ife2 = new InterfaceClass();
		ife2.getStr();
	}
}
