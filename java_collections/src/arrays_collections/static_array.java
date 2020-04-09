package arrays_collections;

public class static_array {

	public static void main(String args[]) {

		int a = 10;// simple integer
		int i1[] = new int[10];// array with integer data type and size declared
		int[] i2 = new int[10];// array with integer data type and size declared
		int[] i3 = { 1, 2, 3, 4, 4, 5, 5, 5, 5 };// array with integer data type and memeber's declared
		int i4[];// array declared
		i4 = new int[] { 1, 2, 3, 4, 6 };// same array above which is declared is initialised here
		int i5[] = new int[] { 10, 20, 30, 40, 50, 60 };
		// int i6 []= new int[];// compile time error the variable must intialize the
		// array

		int array1[] = new int[10];
		array1 = new int[] { 5, 2, 2, 2, 2, 2, 2, 2, 2 };// error here as u are trying to iniatilaize an array index
															// with multiple values
		// also error here as the array.length is just 10(0_9) no 10 element included,
		// possible array out of bound exceptio

		int array2[];
		array2 = new int[10];
		array2 = new int[] { 1, 3, 4, 5, 67, 8 };
		int  array[][] ;

		Object ob[] = new Object[5];
		ob[1] = 1;
		ob[2] = 3;
		ob[3] = "hh";
		ob[4] = "ok";

		System.out.println(i3[3]);

		System.out.println(i4[2]);

		System.out.println(array1[3]);
		for (Object x : ob)
		{

			System.out.println(x);
		}
	
	for(int i=0; i<i4.length;i++)
	{
		System.out.println( i4[i]);
		
	}
}
}