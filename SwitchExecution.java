package package1;

import java.util.Scanner;

public class SwitchExecution {

public static void main(String[] args) {
	
	System.out.println("Enter the numbers:");
	Scanner s2=new Scanner(System.in);
	int b=s2.nextInt();
	int c=s2.nextInt();	
	

	int i;
	 
	for(i=0;i<4;i++)
	{
		
	System.out.println("Enter your favourite operation:");

	int ch=s2.nextInt();

	switch(ch)
	{
		case 1: int sum=b+c;
		       System.out.println("sum is:"+sum);
		        break;
		case 2:int difference=b-c;
		        System.out.println("sum is:"+difference);
		        break;
		
		case 3: int product=c*b;
		System.out.println("sum is:"+product);
		break;
		
		
		default: System.out.println("INVALID");	
		
	}
	}
	s2.close();
	
	}

	
}


