package package2;

import java.util.Scanner;

public class Assignment16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the side:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		
		float squareperimeter=4*a;
		System.out.println("Perimeter of the square is:"+squareperimeter);
		float squareArea=a*a;
		System.out.println("area of the square is:"+squareArea);
		s1.close();
	

	}

}
