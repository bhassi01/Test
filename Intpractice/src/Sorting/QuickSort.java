package Sorting;

public class QuickSort {
	
	public static void main(String args[])
	{
		
		int arr[]= {1,12,12,33,4,12,10,23,15};
		int length= arr.length;
		sort( arr,0,length-1);
		printarray(arr);
		
	}

	public static  int partition(int arr[], int low, int high) {
		
		
		int pivot =arr[(low+high)/2];
		System.out.println("pivot is --"+pivot);
		while (low <=high) {
			
			while (arr[low]<pivot) {
				 low++;
				 System.out.println("low is "+ low);
				}
			while (arr[high]>pivot) {
				high--;
				System.out.println("high is "+ high);
			    }
			if(low<=high) {
				System.out.println("Below indexes will swap");
				 System.out.println("element at index "+ low);
				 System.out.println("element at index "+ high);
				int temp =arr[high];
				arr[high]=arr[low];
				arr[low]=temp;
				low++;
				high--;
			}
			
			
		}
		return low;
		
	}

public  static void sort(int arr[],int low, int high) {
	
	
	int pi= partition(arr,low,high);
	if(low<pi-1)
	sort(arr,low,pi-1);
	if(high>pi)
	sort( arr,pi,high);
	}


 static void printarray( int arr[]) {
	 
	 for(int a :arr) {
		 
		 System.out.print(a+ " ");
	 }
 }
}