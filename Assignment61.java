package package2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Aathu");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Asin");
		
		System.out.println(a1);
		
		System.out.println("Forward iteration is:");
		
		 ListIterator<String> i1=a1.listIterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
	}

}
