package Sorting;

public class InsertionSort {

	static int [] array= {5,100,11,1,0,22,34,7,10,2,3,4,6,98,12,45,48,9,26,28};
	
	public static void main(String args[])
	{
		sort(array);
		for (int a :array) {
			
			System.out.print(a+" ");
		}
		
		
	}

	public static  void sort( int arr[]) {
		for (int i=0;i<array.length-1;i++) {
			int j=i+1;
			while(j>0 && arr[i]>arr[j] ) {
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j--;
				i--;


			}
			
             
}





	}

}
