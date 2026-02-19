package package2;

import java.util.ArrayList;

public class Assignment55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("anju");
		a1.add(1);
		a1.add("sanju");
		a1.add("ranju");
		a1.add(1,"ganju");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("anju1");
		a2.add("2");
		a2.add("sanju1");
		a2.add('c');
		a2.add(0,"ganju1");
		System.out.println(a2);
		a1.addAll(a2);
		
		System.out.println(a1);
		System.out.println(a1.contains("anju1"));
		System.out.println(a1.containsAll(a2));
		a1.remove("anju");
		a2.remove("anju1");
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(a2.isEmpty());
a1.removeAll(a2);
System.out.println(a1);

		

	}

}
