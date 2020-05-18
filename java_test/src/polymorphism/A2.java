package polymorphism;

public class A2 extends A1 {

	// A2() {
	// super();
	// }

	// public static void Test1( int a) {
	// System.out.println("Printing overloaded static test1 from A1");
	//
	// }
	// public static void Test1( ) {
	// System.out.println("Printing overloaded static test1 from A1");
	//
	// }
	public void Test3() {
		System.out.println(" Printing in  Parent A2 class");


	}
	public void Test1( String s) {
		System.out.println(" Printing over ridden method from child class");


	}

	public static void main(String args[]) {



		//upcasted object
		A1 ref1= new A2();
		ref1.Test1("");


	}
}
