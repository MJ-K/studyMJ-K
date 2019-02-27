package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class test6_date {
	public static void main(String[] args) {
		SimpleDateFormat mSimpleDateFormat = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss", Locale.KOREA );
		Date currentTime = new Date ();
		String mTime = mSimpleDateFormat.format ( currentTime );
		System.out.println ( mTime );

	}
}
