package java_test;

public class object_creation {
	 public static void main (String args[])
	 {
		 Nonstatic_method.chk_statik();
		 Nonstatic_method ref= new Nonstatic_method();
		 ref.chk_nonstatik();
		 System.out.println("Nonstatic value from another class "+ref.res);
		  ref.res= true;
		  ref.b=11;
	System.out.println("updated non static  boolean value after first change  is "+ ref.res);
	System.out.println("updated non static  integer value after first change  is "+ ref.b);
	System.out.println("Static value  from another class using dot operator="+Nonstatic_method.a);
	System.out.println("Static  value from another class using ref variable ="+ ref.a);
	//marking the ref value as null
	ref = null;
	System.out.println("Value of new ref is " + ref);
	
		 
	 }

}
