package package2;

import java.util.Scanner;

public class Assignment15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sides:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		
		float rectangleperimeter=2*(a+b);
		System.out.println("Perimeter of the rectangle is:"+rectangleperimeter);
		float rectangleArea=a*b;
		System.out.println("Area of the rectangle is:"+rectangleArea);
		s1.close();

	}

}
