package package1;


 class Parentclass
{
	static void add()
	
	{
		System.out.println("Addition is my duty");
		
	}
	
void mul()
	
	{
		System.out.println("Multiplication is my duty");
		
	}

static void sub()
	
	{
		System.out.println("subtraction is my duty");
		
	}
void div()

{
	System.out.println("division is my duty");
	
}

}

public class NonstaticmethInheritance extends Parentclass{
	
static void modulus()
	
	{
		System.out.println("Modular operation is my duty");
		
	}
	
void comparison()
	
	{
		System.out.println("comparison is my duty");
		
	}

static void increment()
	
	{
		System.out.println("increment is my duty");
		
	}
void decrement()

{
	System.out.println("decrement is my duty");
	
}

	public static void main(String[] args) {
		
		NonstaticmethInheritance ni=new NonstaticmethInheritance();
		modulus();
		increment();
		ni.comparison();
		ni.decrement();
		add();
		sub();
		ni.mul();
		ni.div();
		
		
		// TODO Auto-generated method stub

	}

}
