package package1;

import java.util.Date;

public class Dateprogramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String format1=d2.toString();
		System.out.println(format1);
		String day=format1.substring(8, 10);
		System.out.println(day);
		String month=format1.substring(4, 7);
		System.out.println(month);
		String year=format1.substring(format1.length()-4);
		System.out.println(year);
		String hour=format1.substring(11,13);
		System.out.println(hour);
		String minute=format1.substring(14,16);
		System.out.println(minute);
		String seconds=format1.substring(17,19);
		System.out.println(seconds);
		
		System.out.println("Formatted output is:"+day.concat("-").concat(month).concat("-").concat(year).concat("-").concat(hour).concat("-").concat(minute).concat("-").concat(seconds));
		

	}

}
