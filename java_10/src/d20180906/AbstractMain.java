package d20180906;

public class AbstractMain {
	public static void main(String[] args) {
		고래 w = new 고래();
		토끼 r = new 토끼();
		다람쥐 s = new 다람쥐();		
		
		w.먹기();
		r.자기();
		s.나무오르기();
		
		/*포유류 p = new 포유류();
		p.먹기();*/
		
		System.out.println("------------------------------");
		// 말 한마리 만들어서 말이 먹고 , 달리기 하도록 해보세요
		말 h = new 말();
		h.먹기();
		h.달리기();
		
	}
}











