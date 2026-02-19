package package2;

class Parentoveride
{
	void addition()
	{
		System.out.println("i will override");
	}
	void addition(float b)
	{
		System.out.println("i am float");
	}
}


public class Assignment26 extends Parentoveride {

	
	public static void main(String[] args) {
		
		Assignment26 a26=new Assignment26();
		a26.addition(2);
		a26.addition();
		Parentoveride pv=new Parentoveride();
		pv.addition();
	}
	
	void addition()
	{
		System.out.println("i wont override");
	}
	void addition(int a)
	{  
		super.addition(5.34f);
		System.out.println("i am int");
	}
}
