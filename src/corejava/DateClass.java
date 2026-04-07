package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
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

}
