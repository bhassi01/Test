package begginner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Sort_column {
	 static String [][] arr= new String [][] {{"1","Tuffey","Dog"},{"2","Oscar","Cat"},{"3","Radd","Rabbit"}};
	  static int row = arr.length;
	  static int column = arr[0].length;
	 
	 
	 public static void main(String args[])
	 {
		 System.out.println(row);
		 System.out.println(column);
		 
		 for(int i=0;i<row;i++)
		 {
			 for (int j=0;j<column;j++)
			 {
				 if (j==1) {
				 System.out.println(arr[i][j]);}
			 }
			 
		 }
		 
		List<String[]>al= Arrays.asList(arr);
		
		System.out.println(al);
		 
//		 Set set =new HashSet();
//		 Collections.addAll(set, Arrays.toString(arr));
//		 System.out.println(set);
//		 
		 
		//---- code for  wait without  waits
//		 System.out.println(System.currentTimeMillis());
//		 for (long t=System.nanoTime()+TimeUnit.SECONDS.toNanos(10);t>System.nanoTime();)
//		 {}
//		 
//		  System.out.println(System.nanoTime());
		 
	 } 

}
