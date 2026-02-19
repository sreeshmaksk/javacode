package package2;

public class Assignment22 {
	 static int a=10;
     final int b=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment22 a2=new Assignment22();
    int sum;
    sum=a+a2.b;
     System.out.println("sum is"+sum);
     a2.sub();
    

	}
	 public void sub()
     { 
		 Assignment22 a2=new Assignment22();
		 final int c=15;
     
    	 int sub=c-a2.b;
    	 System.out.println("difference is"+sub);
    	 
     }

}
