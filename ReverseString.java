package package1;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println("Enter the input string");
		Scanner s1=new Scanner(System.in);
		String a=s1.next();
		
		String b=" ";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			char s=a.charAt(i);
			b=b+s;
			
		}
	System.out.println("Reversed string is"+b);

	s1.close();
	}

}
