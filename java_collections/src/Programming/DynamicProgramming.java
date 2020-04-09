package Programming;

import java.util.Scanner;

public class DynamicProgramming {

	public static int  no_of_ways( int n) {

		if (n==1 ||n==2)
			return 1;
		if (n==3)
			return 2;
		else return no_of_ways(n-3)+no_of_ways(n-1);
	}




	public static void main(String args[])
	{
		System.out.println("enter no of total qty:");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int x=no_of_ways(b);
		System.out.println(x);

	}
}