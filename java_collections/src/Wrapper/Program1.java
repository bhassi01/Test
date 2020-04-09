package Wrapper;

public class Program1 {

	static Integer a = new Integer(25);

	public static void main(String args[]) {
		System.out.println(a);
		System.out.println(a.hashCode());
		//now change the ref (a) to int and check the hashcode
		int n = a;
		System.out.println("Value "+n);
		 //System.out.println(n.hashCode());
		 //error that cant invoke  hashcode to primitive datatype as now INT a has been  changed to int n

	}

}
