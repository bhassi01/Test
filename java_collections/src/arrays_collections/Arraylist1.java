package arrays_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String args[]) {
		ArrayList AL = new ArrayList();
		int arr[]= new int [] {1,2,3,4,5,6};

		Student st1 = new Student(2, "Akash", 5);
		Student st2 = new Student(4, "Bhassi", 9);
		 System.out.println(st1);
		 System.out.println(st2);

		AL.add(new Student(3, "Ravi", 8));
		 
		AL.add(st1);
		AL.add(st2);

		System.out.println(AL.size());
		System.out.println("---------------------printing AL----");	
		for (Object al : AL) {
			System.out.println(AL);}
		System.out.println("---------------------printing al----");
		for (Object al : AL) {
			System.out.println(al);}

		//for(Object ar:arr)
		{System.out.println("---------------------printing arr----");
		System.out.println(arr);}
		//for(Object ar:arr)
		{System.out.println("---------------------printing ar----");
		System.out.println(arr);}


	}


	//		System.out.println(AL);
	//
	//		for (int i = 0; i < AL.size(); i++) {
	//			System.out.println(AL.get(i));

	//}

	//		Iterator i = AL.iterator();
	//		while (i.hasNext()) {
	//
	//			System.out.println(i.next());
	//		}
	//
	//		while (AL.iterator().hasNext())
	//		{
	//			
	//			System.out.println(AL.iterator().next());
	//		}
	//		

	//}

}
