package package1;

public class Thisclass {
	
	Thisclass()
	{
		System.out.println("i am one");
	}
	Thisclass(char b)
	{
		this(3.2345);
		System.out.println("i am two");
	}
	Thisclass(int a)
	{
		this('b');
		System.out.println("i am three");
	}
	Thisclass(boolean a,String b)
	{
		this(100);
		System.out.println("i am four");
	}
	Thisclass(double a)
	{
		this();
		System.out.println("i am five");
	}
public static void main(String[] args) {
	
	new Thisclass(true,"sreeshma");
}
}
