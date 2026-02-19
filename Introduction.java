package package1;

import java.util.Scanner;

public class Introduction {
	 Introduction(int a,float b)
		{
			float sum=a+b;
			System.out.println("sum is :"+sum);
			
		}
	 Introduction()
		{
			
			
		}
	
	
	
	public Introduction(short c,short d)
	{
		int diff=d-c;
		System.out.println("difference is :"+diff);               
		
	}
	
	
	 public void add(int a,float b)
	 {
		 float product=a*b;
			System.out.println("product is :"+product);
	 }
	 
	 public static void add(float a,float b)
	 {
		 float quotient=a/b;
			System.out.println("quotient is :"+quotient); 
	 }
	
	
public static void main(String[] args) {

	Scanner s1=new Scanner(System.in);
	System.out.println("Enter your numbers:");
	int a=s1.nextInt();
	float b=s1.nextFloat();
	short c=s1.nextShort();
	short d=s1.nextShort();
	int e=s1.nextInt();
	float f=s1.nextFloat();
	float g=s1.nextFloat();
	float h=s1.nextFloat();
	new Introduction(a,b);
	new Introduction(c,d);
	Introduction i2=new Introduction();
	i2.add(e,f);
	add(g,h);
	s1.close();
	
	

	
	
	
	
}

}
