package java_test;

public class Nonstatic_method {
	
	//Data members
	//Static data
	static   float  a = 3.6f;
	//Non static variable 
	 boolean res = false;
	  int b = 10;
	 
	 //Member functions
	 public static void chk_statik()
	 {
		 System.out.println("Inside Static method");
		 a= 9.0f;
		 System.out.println("updated value  of static variable is ="+a);
		 
	 }
	 
	public void chk_nonstatik()
	{
		System.out.println("inside non static method");
		 System.out.println("Non static variable is "+ res);
		 
	}
	
	public static void main(String args [])
	{
		System.out.println("Entering main method");
		//static variable from same class
		System.out.println("Value of static variable a =" +a);
		//non static variable from same class
		System.out.println("Value of boolean non static variable is="+ new Nonstatic_method().res);
		//static method from same class
		chk_statik();
		// nonstatic method from same class
		new Nonstatic_method().chk_nonstatik();
		System.out.println("Exiting main method");
		
		
		
	}
	
	

}
