package java_test;

public class first_method {
	
	public static void method1( int a, int b)
	
	{
	System.out.println("Executing first method");	
	System.out.println("Sum of the numbers is =" + (a+b));
	
	}
	
	public static int method2( int a,int b) {
		System.out.println("Executing return method");
		return b-a;
		
	}
	
	
		
		
		
	public static void main ( String args[]) 
	
	{
		System.out.println("executing  in main method");
		
		method1(4,9);
		int c = method2(6,10);
		System.out.println("result of second method is  " +c);
		
	}

}
