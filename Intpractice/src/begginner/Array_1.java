package begginner;

public class Array_1 {
	static int temp;

	static int array[] = new int[] { 5, 99, 88, 41, 100, 101 };

	public static void main(String args[]) {
		System.out.println(array.length);
		findelement(array);

	}

	public static  void  findelement(int arr[])
	{  
		for(int i =0;i<arr.length-1;i++)
		{
			if (arr[i]>arr[i+1])
			{
				temp=arr[i+1] ;
				arr[i+1]=arr[i];
				arr[i]=temp;

			}
		

		}
		System.out.println (arr[(arr.length)-2]);
	}

}
