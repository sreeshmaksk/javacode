package package2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Sudev");
		a1.add("Aathu");
		a1.add("Sudev");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Asin");
		String str="Sudev";
		
		System.out.println(a1);
		
		System.out.println("Forward iteration is:");
		
		 ListIterator<String> i1=a1.listIterator();
		 while(i1.hasNext())
		 {
			if(i1.next().equals(str))
			{
				i1.remove();
			}
			else
			{
				continue;
			}
		 }
		 System.out.println(a1);
	}

}
