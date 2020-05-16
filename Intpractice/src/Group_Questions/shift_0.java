package Group_Questions;

import java.util.ArrayList;
import java.util.Arrays;

public class shift_0 {
	static int[] a ={1,0,3,2,0,2,6,0,2,10,5,7};
	static int[]b = new int [a.length];
	static int t =0;
	static ArrayList<Integer> al= new ArrayList<Integer>();

	public static  void main (String args[])
	{
		Arrays.sort(a,0,a.length);
		
	for (int i=a.length-1;i>=0;i--)
	{
		b[t]=a[i];
		++t;
		
		
	}
		for(Integer t:b)
		{System.out.println(t);
			
		}
		
				
			
			
			
			
	}
		



	

}
