package practiceEasy;

//below program is coded to print the fibonaci numbers
public class Fibonacci {

	public static void main(String args[]) {
		System.out.println("Inside main method");
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Printing Fibonacci series");

		System.out.print(+a +" "+b+" ");

		for ( int i = 0; i < 7; i++) {


			c = a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
			

		}
		System.out.println();
		System.out.println("Main method ended");
	}

}
