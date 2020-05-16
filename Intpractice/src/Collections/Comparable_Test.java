package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Comparable;

public class Comparable_Test implements Comparable<Comparable_Test> {

	 String name;
	 int id;
	 double salary;
	static ArrayList<Comparable_Test> al = new ArrayList<Comparable_Test>();

	Comparable_Test(String name, int id, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	    public int compareTo(Comparable_Test ob) {
	        return this.getId() - ob.getId();
	    }

	    // Two employees are equal if their IDs are equal
	   

	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
public String toString()
{
	return  name  +"  "+id +"   " + salary;
}
	

	public static void main(String args[]) {

		Comparable_Test ct1 = new Comparable_Test("Bhaskar", 4, 25000);
		al.add(ct1);
		Comparable_Test ct2 = new Comparable_Test("Pabbie", 2, 35000);
		al.add(ct2);
		Comparable_Test ct3 = new Comparable_Test("Lucky", 3, 45000);
		al.add(ct3);
		al.add(new Comparable_Test("Mummy",1,22000));
        System.out.println("Before sorting--->" + al);
        //This is the method which will check compare to method and compare the elements in the list, here its doing based on id 
		Collections.sort(al);
		System.out.println("After sorting------->"+al);
		
	}

	
}
