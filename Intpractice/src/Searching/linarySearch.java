package Searching;

import java.util.Scanner;

public class linarySearch {
	public static void main(String args[]) {
		
		
		int ar[]= {21,10,5,0,5,6,9,100,12,21};
		System.out.println("Enter the number to be searched");
		Scanner Next =  new Scanner(System.in);
		int search = Next.nextInt();
		 int temp=0;
		for(int i=0;i<ar.length;i++ ) {
			
			if(ar[i]==search) {
				
				System.out.println("Item is at "+i +" index level");
				temp++;
				break;
				
			}
			
			
		}
		if (temp==0) {
			
			System.out.println("Element is not present in the list");
		}
		
	}

}
