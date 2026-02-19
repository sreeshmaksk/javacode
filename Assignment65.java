package package2;

import java.util.ArrayList;

public class Assignment65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Aathu");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Asin");
		a1.add(3, "RITWIK");
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		System.out.println(a1.isEmpty());
	}

}
