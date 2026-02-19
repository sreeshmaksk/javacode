package package2;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sides:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		float c=s1.nextFloat();
		float triangleperimeter=a+b+c;
		System.out.println("Perimeter of the triangle is:"+triangleperimeter);
		double Trianglearea=0.5*b*a;
		System.out.println("Area of the triangle is:"+Trianglearea);
		s1.close();
	}

}
