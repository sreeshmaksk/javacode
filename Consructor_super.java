package package1;

class test1
{
	test1()
	{
		super();
		System.out.println("Constructor1");
	}
}
class test2 extends test1
{
	test2()
	{
		super();
		System.out.println("Constructor2");
	}
}
public class Consructor_super extends test2{
	
	Consructor_super()
	{
		super();
		System.out.println("Constructor3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consructor_super cs=new Consructor_super();
		

	}

}
