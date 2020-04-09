package begginner;

import java.util.Arrays;

public class shift_0_second {
	static int[] a ={1,1,1,1,1,1,1,0,0,0,0,0}; static int t=a.length-1;
	public static void main (String args[])
	{ int temp;
	int j =0;
	for (int i=0;i<=t;i++)
	{//System.out.println("Inside for loop");
		//System.out.println(+i);
		System.out.println(a[i] + ""+ a[j]);
		if (a[i]!=0){
			temp=a[j];
			a[j]=a[i];
			a[i]=temp;
			System.out.println(a[i] + ""+ a[j]);
			j++;
			System.out.println(Arrays.toString(a));
		}

	}

	System.out.println(Arrays.toString(a));
	}
}
