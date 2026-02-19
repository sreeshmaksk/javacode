package package2;

import java.util.ArrayList;

public class Assignment68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Aathu");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Asin");
		a1.add(3, "RITWIK");
		System.out.println(a1.contains("Aathu"));
		ArrayList<String> a2=new ArrayList();
		a2.add("Anil");
		a2.add("Sunil");
		a2.add("Rajeev");
		a2.add("Neenu");
		a2.add("Veena");
		a2.addAll(a1);
		System.out.println(a1.containsAll(a2));
		System.out.println(a2.containsAll(a1));
		
	}

}
