package begginner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Noofpnz {
	static int  positivecount ;
	static int negativecount;
	static int zerocount;
	static  ArrayList<Double> al = new ArrayList<Double>();
	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		double d=arr.length;
		for (int i= 0;i<arr.length;i++ )
		{
			if(arr[i]>0)
			{
				++ positivecount;

			}



			if(arr[i]<0)
			{				++negativecount;
			}	 


			if (arr[i]==0) {
				++ zerocount ;  }



		}
		System.out.println(negativecount);
		System.out.println(positivecount);
		System.out.println(zerocount);
		System.out.println(d);

		double p=(positivecount/d);
		double n=(negativecount/d);
		double z=(zerocount/d);

		System.out.println( +p );


		al.add(p);
		al.add(n);
		al.add(z);

		if ( arr.length==positivecount||arr.length==negativecount|| arr.length==zerocount )
		{
			System.out.println(p);
		}
		else {
			for(Object ob:al)
			{
				BigDecimal  pvalue= new BigDecimal(String.valueOf(ob));
				int intpvalue=pvalue.intValue();
				System.out.println(intpvalue);
				System.out.println(pvalue.subtract(new BigDecimal(intpvalue)).toPlainString());



			}
		}}

	//private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int arr []= new int []{1,11,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		plusMinus(arr);


		//		int n = scanner.nextInt();
		//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		//		int[] arr = new int[n];
		//
		//		tring[] arrItems = scanner.nextLine().split(" ");
		//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		//
		//		for (int i = 0; i < n; i++) {
		//			int arrItem = Integer.parseInt(arrItems[i]);
		//			arr[i] = arrItem;
		//		}
		//
		//		plusMinus(arr);
		//
		//		scanner.close();

	}


}
