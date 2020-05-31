package practiceEasy;

import java.util.Scanner;

//below program checks for a number to be  prime

public class Prime {
	
	
	public static void main( String args[]) {
		
	System.out.println("Inside main method");
	System.out.println("Enter no to be checked");
	Scanner next =  new Scanner(System.in);
	boolean flag = true;
	int  n =  next.nextInt();if(n==0 || n==1) {
		 
		 System.out.println("No is not considerable");
		  
		 
	 }
	else {
	 
	 for (int  i=2;i<=(n/2);i++) {
		 
		
		 
		 if (n%i==0) {
			 System.out.println("No is completely divisible by "+i);
			 flag= false;
			 break; 
			 
		 }}
		
		 
	 
		if(flag==true) {
			
			
			System.out.println("Entered number is prime");
		}
		
		else
		{
			System.out.println("Entered no is not prime");
			
		}
	 	
		
	}

	}
}


