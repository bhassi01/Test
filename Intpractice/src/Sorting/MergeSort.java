package Sorting;

public class MergeSort {
	int array[];
	int[] tempmergearray;
	int length;

	public static void main(String args[]) {

		int ar[] = { 2, 2, 12, 14, 1, 10, 23, 76, 43, 12, 100 };
		int length = ar.length;
		MergeSort ms= new MergeSort();
		ms.sort(ar);
		printarray(ar);
		
	}

	public void sort(int a[]) {
		this.array = a;
		this.length = a.length;
		this.tempmergearray = new int[length];
		divideArray(0, length - 1);

	}

	public void divideArray(int low, int high) {

		if (low < high) {

			int middle = (low + high) / 2;
			divideArray(low, middle);
			divideArray(middle + 1, high);
			mergeArray(0,middle,high);
			
		}

	}
	public void mergeArray(int low, int middle, int high) {
		for(int i=low;i<=high;i++) {
			tempmergearray[i]=array[i];
			printarray(tempmergearray);
		}
		printarray(tempmergearray);
		int i=low;
		int j=middle+1;
		int k=low;
		while(i<=middle &&j<=high) {
			if(tempmergearray[i]<=tempmergearray[j]) {
				System.out.println("putting value"+tempmergearray[i]);
				array[k]=tempmergearray[i];
				i++;
				
			}
			else {
				System.out.println("putting value"+tempmergearray[j]);
				array[k]=tempmergearray[j];
				j++;
		}
		k++;
	}
	while(i<=middle) {
		array[k]=tempmergearray[i];
		k++;
		i++;
	}	
	}
	 static void printarray( int arr[]) {
		 
		 for(int a :arr) {
			 
			 System.out.print(a+ " ");
		 }
		 System.out.println("");
		 }
}
