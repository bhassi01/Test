package Naveen_practice;

public interface Bank {

	int initial_balance = 999;

	public void chk_bal();

	public void add_money();

	public void withdraw_money();

	public static void main(String args[]) {
		System.out.println(" Hi Iam printing");
		test();
	}

	public static void test() {
		System.out.println("Using Test method");
	}

}

//From java 8 we can have method implementations for static and default type methods.
//if not mentioned as static they are implicitly marked as public and  abstract.
