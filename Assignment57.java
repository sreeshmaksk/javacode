package package2;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a1=new ArrayList();
		a1.add("anju");
		a1.add(1);
		a1.add(3.14);
		a1.add('c');
		a1.add(1,"ganju");
		System.out.println(a1);
		
		 Iterator i1=a1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
		 
			 
		 

	}

}
