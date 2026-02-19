package package2;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a1=new Vector();
		a1.add("anju");
		a1.add(1);
		a1.add(3.14);
		a1.add('c');
		a1.add(1,"ganju");
		System.out.println(a1);
		
		 Enumeration e1=a1.elements();
		 while(e1.hasMoreElements())
		 {
			 System.out.println(e1.nextElement());
		 }
	}

}
