package package2;
		// TODO Auto-generated method stub

    class StudentS{
    	StudentS()
    	{
    		System.out.println("I am a student");
    	}
    }
     class PendingWorkS extends StudentS
     {
    	 PendingWorkS(int a, float b)
    	 {
    		 this('d');
    		 System.out.println("i am  handling int and float");
    	 }
    	 PendingWorkS(char c)
    	 { this("sreeshma");
    		 System.out.println("i am  handling char");
    	 }
    	 PendingWorkS(String str)
    	 { 
    		 this(1.89f);
    		 System.out.println("i am  handling string");
    	 }
    	 PendingWorkS(float g)
    	 { this(3455667677878l);
    		 System.out.println("i am handling short");
    	 }
    	 PendingWorkS(long v)
    	 {
    		 System.out.println("i am  handling long");
    	 }
    	 PendingWorkS()
    	 { 
    		 this(2,5);
    		 System.out.println("i am  idle");
    	 }
     }
     
     
     
     
     class Assignment24 extends PendingWorkS
     {
    	 public static void main(String[] args) {
    	 
    		 Assignment24 A24=new Assignment24();
    		 
    	 }
    	 
    	 Assignment24()
    	 {
    		 System.out.println("i am  Assignment24");
    	 }
     }
	



