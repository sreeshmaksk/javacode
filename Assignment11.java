package package2;

public class Assignment11 {
	Assignment11()
	{
		System.out.println("I have nothing to operate");
	}
	Assignment11(int a,int b)
	{
		System.out.println("My int numbers to operate");
	}
	Assignment11(float a,float b)
	{
		System.out.println("My float numbers to operate");
	}
	
	static void add()
	{
		System.out.println("I am responsible for  addition");
	}
	static void add(double a,double b)
	{
		System.out.println("I am responsible for double addition");
	}
	 void add(int a,short b)
	{
		System.out.println("I am responsible for int-short addition");
	}
	void add(short b,int a)
	{
		System.out.println("I am responsible for short-int addition");
	}
	

	public static void main(String[] args) {
		int a=10;
		int b=12;
		int c=14;
		int d=16;
		float e=3.2f;
		float f=1.6f;
		double g=3.8999;
		double h=3.8997;
		short j=4;
		short k=9;
		Assignment11 a1=new Assignment11();
		Assignment11 a2=new Assignment11(a,b);
		Assignment11 a3=new Assignment11(e,f);
		add();
		add(g,h);
		a1.add(c, j);
		a3.add(k, d);
		
	
		// TODO Auto-generated method stub
 
	}

}
