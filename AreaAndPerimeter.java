package package1;

import java.util.Scanner;

public class AreaAndPerimeter {
	
	public static void circlePerimetr()
	{
		System.out.println("Enter the radius of the circle:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		double circleperimeter=2*Math.PI*a;
		System.out.println("Perimeter of the circle is:"+circleperimeter);
		s1.close();
	// TODO Auto-generated method stub

}
	public static void circleArea()
	{
		System.out.println("Enter the radius of the circle:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		double circlearea=Math.PI*a*a;
		System.out.println("Area of the circle is:"+circlearea);
		s1.close();
	// TODO Auto-generated method stub

}
	public static void trianglePerimetr()
	{
		System.out.println("Enter the sides:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		float c=s1.nextFloat();
		float triangleperimeter=a+b+c;
		System.out.println("Perimeter of the triangle is:"+triangleperimeter);
		s1.close();
	// TODO Auto-generated method stub

}
	public static void triangleArea()
	{
		System.out.println("Enter the two sides:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		double Trianglearea=0.5*b*a;
		System.out.println("Area of the triangle is:"+Trianglearea);
	// TODO Auto-generated method stub
		s1.close();

}
	public static void squarePerimetr()
	{
		System.out.println("Enter the side:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		
		float squareperimeter=4*a;
		System.out.println("Perimeter of the square is:"+squareperimeter);
		s1.close();
	// TODO Auto-generated method stub

}

	public static void squareArea()
	{
		System.out.println("Enter the side:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		
		float squareArea=a*a;
		System.out.println("Perimeter of the square is:"+squareArea);
		s1.close();
	// TODO Auto-generated method stub

}
	public static void rectanglePerimetr()
	{
		System.out.println("Enter the sides:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		
		float rectangleperimeter=2*(a+b);
		System.out.println("Perimeter of the rectangle is:"+rectangleperimeter);
		s1.close();
	// TODO Auto-generated method stub

}
	public static void rectangleArea()
	{
		System.out.println("Enter the sides:");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float b=s1.nextFloat();
		
		float rectangleArea=a*b;
		System.out.println("Area of the rectangle is:"+rectangleArea);
		s1.close();
	// TODO Auto-generated method stub

}
	public static void main(String[] args) {
		circlePerimetr();
		circleArea();
		trianglePerimetr();
		triangleArea();
		squarePerimetr();
		squareArea();
		rectanglePerimetr();
		rectangleArea();
	
	}

}
