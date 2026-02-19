package package2;

import java.util.ArrayList;

public class Assignment63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Aathu");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Asin");
		
		System.out.println(a1);
		
		ArrayList<String> a2=new ArrayList();
		a2.add("Anil");
		a2.add("Sunil");
		a2.add("Rajeev");
		a2.add("Neenu");
		a2.add("Veena");
		
		System.out.println(a2);
		System.out.println(a2.addAll(a1));
		System.out.println(a2);
		a1.addAll(2, a2);
		System.out.println(a1);
	}

}
