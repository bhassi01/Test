package Collections;

import java.util.ArrayList;

public class Array_List {
	 static ArrayList al2= new ArrayList();

	public static void main(String args[])
	{
		
		 Employees e1 = new Employees("Pabbie", 2, 35000);
		
		 System.out.println(al2);
	  
		 Employees e2 = new Employees("Bhaskar", 1, 25000);
		 System.out.println(e2);
System.out.println(e1);
		 al2.add(e2);
		  al2.add(e1);
System.out.println(al2);	 
		Employees e3 = new Employees("Suman", 3, 45000);
		 al2.add(e1);
		 al2.add(e1);
		  al2.add(1);
		  al2.add(2);
		  System.out.println(al2);
		  al2.add("java");
	}
}
