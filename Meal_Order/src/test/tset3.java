package test;

import java.util.Calendar;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class tset3 extends Thread{
	 
	 static int year(long millisec){
	      return (int)((millisec/(3600000)) % 24)+9;
	 }
	 static int month(long millisec){
	      return (int)((millisec/(3600000)) % 24)+9;
	 }
	 static int day(long millisec){
	      return (int)((millisec/(3600000)) % 24)+9;
	 }
	 static int hour(long millisec){
	      return (int)((millisec/(3600000)) % 24)+9;
	 }
	 static int minute(long millisec) {
	      return (int)((millisec/60000) % 60);
	 }
	 static int second(long millisec) {
	      return (int)((millisec/1000) % 60);
	 }
	 
	public static void main(String[] args) {
/*		long millisec = System.currentTimeMillis();
		System.out.println("년 : "+year(millisec));
		System.out.println("월 : "+month(millisec));
		System.out.println("일 : "+month(millisec));
		System.out.println("시 : "+month(millisec));
		System.out.println("분 : "+month(millisec));
		System.out.println("초 : "+month(millisec));
		*/
		
		new tset3().run();

	}
	@Override
	public void run() {
		while(true) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		Calendar cal = Calendar.getInstance();
		 
		//현재 년도, 월, 일
		int year = cal.get ( cal.YEAR );
		int month = cal.get ( cal.MONTH ) + 1 ;
		int date = cal.get ( cal.DATE ) ;
		 
		
		 
		//현재 (시,분,초)
		int hour = cal.get ( cal.HOUR_OF_DAY ) ;
		int min = cal.get ( cal.MINUTE );
		int sec = cal.get ( cal.SECOND );

		System.out.println("년 : "+year);
		System.out.println("월 : "+month);
		System.out.println("일 : "+date);
		System.out.println("시 : "+hour);
		System.out.println("분 : "+min);
		System.out.println("초 : "+sec);
		}
	}
}
