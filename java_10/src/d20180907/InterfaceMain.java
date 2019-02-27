package d20180907;

public class InterfaceMain {
	public static void main(String[] args) {
		말 h1 = new 말();
		h1.먹기();
		h1.비행();
		
		System.out.println();
		
		Marine m1 = new Marine();
		m1.이동하기(100, 200);
		m1.비행();
		
		System.out.println();
		
		Flyable[] fList = new Flyable[2];
		Flyable f = h1;
		fList[0] = f;
		f = m1;
		fList[1] = f;
		
		for(int i=0; i<fList.length; i++){
			fList[i].비행();
		}
	}
}
