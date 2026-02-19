package package2;
abstract class Work
{ 
	abstract  void login();
	
	abstract void logout();
}
abstract class Pending extends Work
{
	abstract void search();
	abstract void payment();
}
public class Assigment27 extends Pending {
	
	public static void main(String[] args) {
		Assigment27 a27=new Assigment27();
		a27.login();
		a27.logout();
		a27.search();
		a27.payment();
	}

	@Override
	void search() {
		// TODO Auto-generated method stub
		System.out.println("i will search");
	}

	@Override
	void payment() {
		// TODO Auto-generated method stub
		System.out.println("i will do payment");
	}

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("i will login");
	}

	@Override
	void logout() {
		// TODO Auto-generated method stub
		System.out.println("i will logout");
	}

}
