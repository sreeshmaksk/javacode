package package2;

import java.util.Scanner;

public class Assignment21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("input from student:"+i);
			int a=s1.nextInt();
			int b=s1.nextInt();
			sum=a+b;
			System.out.println("Sum of the numbers is :"+sum);
			
		}
	}

}
