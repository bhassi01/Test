package Collections;

import java.util.Comparator;
import java.util.*;

public class Comparator_Test {
	 static List<Employees>e= new ArrayList<Employees>();

	
       
	
	public static void main (String args[])
	{
		e.add(new Employees("Aditya",12,280000));
		e.add(new Employees("Bhaskar",12,380000));
		e.add(new Employees("Sohan",1,180000));
		e.add(new Employees("Mohan",2,480000));
		e.add(new Employees("Rohan",5,210000));
		
		System.out.println("Before  sorting------>" +e);
		
		Comparator<Employees> empNameComparator = (Employees emp1, Employees emp2) -> {
		      return (emp1.getName().compareTo(emp2.getName()));
		    };
		    Collections.sort(e,empNameComparator);
		    System.out.println(e);
		    
		    Comparator<Employees> comparatorObj=Comparator.comparing( emp -> emp.getSalary());
		    Collections.sort(e, comparatorObj);
		    System.out.println(e);
	}




}