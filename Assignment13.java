package package2;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of the circle:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		double circleperimeter=2*Math.PI*a;
		System.out.println("Perimeter of the circle is:"+circleperimeter);
		double circlearea=Math.PI*a*a;
		System.out.println("Area of the circle is:"+circlearea);
		s1.close();
	}

}
