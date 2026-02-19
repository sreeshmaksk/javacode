package package2;

 class Teacher {

	 void method3()
		{
			System.out.println("Teacher");
		}
	 

}
 
class Student extends Teacher{
	void method2()
	{
		System.out.println("Student");
	}
	
	
 }
	class Assignments  extends Student
	{
		void method1()
		{
			System.out.println(" Assignments");
		}
		
	}
	
	public class Assignment23 extends Assignments
	{
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Assignment23 a23=new Assignment23();
			a23.method1();
			a23.method2();
			a23.method3();
			
			
	       System.out.println(" Assignment23");
		}
	}
	
	class salary  extends Teacher
	{
		void method4()
		{
			System.out.println(" salary");
			
			
		}
		
		
		
		
		
		
	}
	




 
