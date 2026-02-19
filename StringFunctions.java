package package1;

public class StringFunctions {

	public static void main(String[] args) {
		
		String a="Rajeev KumarI";
		String b="Ram";
		System.out.println(a.substring(6));
		System.out.println(a.toUpperCase());
		System.out.println(a.trim());
		System.out.println(a.isEmpty());
		System.out.println(a.equals("   Rajeev  Kumar  "));
		System.out.println(a.contains(" Kumar  "));
		System.out.println(a.concat(b));
		System.out.println(a.replace("Kumar","aathu"));
		
		//System.out.println(b.replace("(0-9)","Y"));
		
		System.out.println(a.matches("(.*)I"));
		System.out.println(b.matches("(..)"));
				
		// TODO Auto-generated method stub

	}

}
