

package begginner;

import java.util.*;

public class Count1 {
	static int counter;
	static ArrayList<Integer> al = new ArrayList<Integer>();
	static int maxsum = 0;
	static int currentsum = 0;
	// (1,1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,1]

	public static int count(int[] arr) {

		int len = arr.length;
		for (int i = 0; i < len ; i++) {

			if (arr[i] == 1) {
			++currentsum;
				 //System.out.println("current sum=" + currentsum);
				 //System.out.println("Current index ="+i);
			}
				 if (arr[i] == 0) {
					 //i=i+1;
					System.out.println("Current sum before 0--->"+ currentsum);
					maxsum = Math.max(maxsum, currentsum);
					currentsum = 0;
					System.out.println("Current index ="+i);
					
				}
			
			maxsum = Math.max(maxsum, currentsum);

		}
		return (maxsum);
	}

	public static void main(String args[])

	{
		int a[] = new int[] {0};
		int repeated_count = count(a);
		System.out.println("Maximum count " + repeated_count);
	}
}
