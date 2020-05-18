

package java_test;

public class Passby_ref_val {
	
	int a=23;
	String b="hello";
	//Passby_ref_val m;
	
	 public static void main( String atgs[])
	 {
		 Passby_ref_val obj = new Passby_ref_val();
		 int x =9;
		 int y=10;
		 //sum(x,y);
		 obj.sum_call_by_value(x, y);
		 obj.ref_calling(obj);
		 
		  
		 
		 
	 }
	 
//	 public  static void sum( int  a, int b)
//	 {
	 
//		int c = a+b;
//		System.out.println("Value of  summation of the two is"+c);
//		
//		
//		 
//	 }
	 public void sum_call_by_value(int a, int b )
	 {
		 a=19;
		 b=29;
		 int c = a+b;
		 System.out.println("Sum in call by value method is"+ c);
		 
	 }
	 
	 public void ref_calling(Passby_ref_val m)
	 {
		
		 System.out.println("Calling by refence method");
	 }
	 
	 
	 
}

