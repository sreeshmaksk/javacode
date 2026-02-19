package package2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Assignment81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v1=new Vector();
		v1.add("MANU");
		v1.addElement("Ravikiran");
		v1.add(2, "pavan");
		v1.addElement("SAVITA");
		System.out.println(v1);
		Enumeration<String>e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		
		
	}

}
