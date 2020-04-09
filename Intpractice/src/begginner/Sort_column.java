package begginner;

import java.util.concurrent.TimeUnit;

public class Sort_column {
	 static int [][] arr= new int [][] {{1,2,10},{3,4,20},{5,6,30},{6,7,40},{7,8,50}};
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
		 
		 System.out.println(System.currentTimeMillis());
		 for (long t=System.nanoTime()+TimeUnit.SECONDS.toNanos(10);t>System.nanoTime();)
		 {}
		 
		  System.out.println(System.nanoTime());
		 
	 } 

}
