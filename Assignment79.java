package package2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assignment79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1=new HashSet();
		s1.add("Aamani");
		s1.add("Radha");
		s1.add("sudha");
		System.out.println(s1);
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
