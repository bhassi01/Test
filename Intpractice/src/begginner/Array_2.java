package begginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array_2 {

	static Integer [] a2 =  { 9, 100, 5, 6, 7, 8 };
	
	static List<Integer> al ;

	public static void main(String args[]) {
//		char cr2 ='F';
//		int cr3 = cr2+32;
//		System.out.println(cr3);
		Arrays.sort(a2);
		  for (int i=0; i<a2.length;i++) {
		System.out.println(a2[i]);}
		 al =Arrays.asList(a2);
		 Collections.sort(al);
		 System.out.println(al.size());
		  System.out.println(al.get(al.size()-2));
	}

	public static void element(int [] a) {

	
 al =Arrays.asList(a2);
	 System.out.println(al);
		
}
}
