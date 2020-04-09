package exceptions;

public class unchecked {
	
	public static void main (String args[])
	{
		try{
			test();
		System.out.println("Printing without exceptions");
		}
		catch(ArithmeticException ref)
		{
			System.out.println("Caught the exception in test method");
			
		}
	}
	
	 public static void test()
	 {
		 
	int a=1/0;
		
	 }
	 

}
