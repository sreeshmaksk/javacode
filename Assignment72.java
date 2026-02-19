package package2;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("Manju");
		a1.add("Aathu");
		a1.add("Kamath");
		a1.add("Sudev");
		a1.add("Asin");
		a1.add(3, "RITWIK");
		a1.sort(null);
		//Collections.sort(a1);
		System.out.println(a1);
	}

}
