
package Searching;

import java.util.Scanner;

public class binarySearch {

	public static void main(String args[]) {

		int arr[] = { 5, 10, 12, 13, 19, 23, 32, 98, 100 };
		int low = 0;
		int high = arr.length;
		int middle = (low + high) / 2;
		System.out.println("Enter the number to be searched");
		Scanner Next = new Scanner(System.in);
		int temp = 0;
		int search = Next.nextInt();
		while (low <= high) {
			if (arr[middle] == search) {

				System.out.println(" element is in at  " + middle);
				temp++;
				if (temp == 0) {
					System.out.println("Element is not in list");

				}
				break;
			}

			else if (arr[middle] > search) {

				high = middle;
			} else {
				low = middle;
			}
			middle = (high + low) / 2;
		}

		
	}

}
