package package2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Asin");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Ashin");
		a1.add(3, "RITWIK");
		System.out.println(a1);
		ArrayList<String> a2=(ArrayList<String>) a1.clone();
		System.out.println(a2);
		System.out.println(a2.equals(a1));
		System.out.println(a2.lastIndexOf("Asin"));
	}

}
