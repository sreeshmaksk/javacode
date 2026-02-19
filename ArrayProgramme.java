package package1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter integer array size:");
		
		int []rollno=new int [s1.nextInt()];
		for(int i=0;i<rollno.length;i++)
		{
			rollno[i]=s1.nextInt();
		}
		
		System.out.println("Enter char array size:");
		
		char []code=new char[3];
		code[0]='A';
		code[1]='B';
		code[2]='C';
		
		System.out.println("Enter String array size:");
		
		String []names=new String [s1.nextInt()];
		for(int i=0;i<names.length;i++)
		{
			names[i]=s1.next();
		}
		
		System.out.println("Enter boolean array size:");
		
		boolean []answer=new boolean [s1.nextInt()];
		for(int i=0;i<answer.length;i++)
		{
			answer[i]=s1.nextBoolean();
		}
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(code));
		System.out.println(Arrays.toString(names));
		
		System.out.println(Arrays.toString(answer));
		s1.close();



	}

}
