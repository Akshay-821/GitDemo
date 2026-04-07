package corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderClass {
	
	public void date() {
		Date d=new Date();
		//to pring normal Date like (Wed Mar 18 20:24:08 IST 2026)
		System.out.println(d.toString()); 
		
		//to print normal Date in different format
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/YYYY");
		System.out.println(sdf.format(d));
		
		//to print Date with time in different format
		SimpleDateFormat sd=new SimpleDateFormat("M/dd/YYYY hh:mm:ss");
		System.out.println(sd.format(d));
	}

	public static void main(String[] args) {
		
		Calendar cal= Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("M/dd/YYYY");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.MINUTE));
		
		                          

	}

}
