package exceptions;

import java.io.IOException;

public class Demo1 {
	 public void test1() throws IOException
	 {
		 System.out.println("inside test1 method");
		 Demo2 ref1= new Demo2();
		 ref1.test2();
	 }
	 
	 public void test3()
	 {
		 System.out.println("Inside test3 method");
	 }

}
