package Sorting;

public class BubbleSort {

	public static void BubbleSort(int arr[]) {

		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			System.out.println("Round "+(i+1)+"    ");

			for (int j = 1; j <n; j++) {
				System.out.println( (j) + " out of total " + arr.length + " sorting as below----");
				if (arr[j-1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					
				}
				for (int k = 0; k < n; k++) {
			
			System.out.print(arr[k] + " ");
				}
				System.out.println("");
				System.out.println("");

			}
			
			System.out.println("");

		}

	}

	public static void main(String args[]) {
		int ar[] = new int[] { 2, 10, 0, 3, 12, 5, 34, 21, 4, 42, 2, 58, 99, 4, 6, 10 };
		BubbleSort(ar);
		for (int k = 0; k < ar.length; k++) {
			System.out.print(ar[k] + " ");

		}

	}

}
