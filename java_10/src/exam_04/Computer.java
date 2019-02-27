package exam_04;

public class Computer {
	
	//멤버변수
	double monitor;
	String keyboard;
	double 본체;
	double 마우스;
	
	//생성자
	Computer(){
		monitor = 24;
		keyboard = "querty";
		본체 = 20.3;
		마우스 = 3.5;
	}

	Computer(double monitor){
		
		keyboard = "querty";
		본체 = 20.3;
		마우스 = 3.5;

		this.monitor = monitor;
	}//3. Computer 클래스에서 생성자 Overloading 시켜보세요
	
	/////////////////////////////////////////////////////
	
	Computer(double 마우스, double 본체){
		
		this();
		this.마우스 = 마우스;
		this.본체 = 본체;
	}//5. Computer 클래스에서 this, this() 를 적용해서 표현해보세요

	
	Computer(double monitor, double 본체, double 마우스){
		
		this(마우스,본체);
		this.monitor = monitor;
	}
	
	//////////////////////////////////////////
	
	public static void main(String[] args) {
		
		double 마우스 = 3.14;
		double monitor = 10.9;
		double 본체 = 19.2;

		Computer basic = new Computer();
		
		System.out.println("마우스 : "+basic.마우스);
		System.out.println("monitor : "+basic.monitor);
		System.out.println("keyboard : "+basic.keyboard);
		System.out.println("본체 : "+basic.본체);
		
		System.out.println("-----------------");
		
		Computer c = new Computer(monitor);
		
		System.out.println("마우스 : "+c.마우스);
		System.out.println("monitor : "+c.monitor);
		System.out.println("keyboard : "+c.keyboard);
		System.out.println("본체 : "+c.본체);
	
		System.out.println("-----------------");
		
		Computer c1 = new Computer(마우스,본체);

		System.out.println("마우스 : "+c1.마우스);
		System.out.println("monitor : "+c1.monitor);
		System.out.println("keyboard : "+c1.keyboard);
		System.out.println("본체 : "+c1.본체);
		
		System.out.println("-----------------");
		
		Computer c2 = new Computer(monitor, 본체, 마우스);

		System.out.println("마우스 : "+c2.마우스);
		System.out.println("monitor : "+c2.monitor);
		System.out.println("keyboard: "+c2.keyboard);
		System.out.println("본체 : "+c1.본체);
		
	}
}
