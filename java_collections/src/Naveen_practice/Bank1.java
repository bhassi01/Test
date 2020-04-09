package Naveen_practice;

public class Bank1 implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank1 b1 = new Bank1();// Object of the same class
		b1.add_money();
		b1.chk_bal();
		b1.withdraw_money();
		b1.sum();

		Bank b2 = new Bank1();// an implementing class upcasted to interface ref

		b2.add_money();
		b2.chk_bal();
		b2.withdraw_money();
		((Bank1) b2).sum();// here downcasting has been done to use sum method which was upcasted

	}

	@Override
	public void chk_bal() {
		// TODO Auto-generated method stub

		System.out.println(" Checking  bal");

	}

	@Override
	public void add_money() {
		// TODO Auto-generated method stub
		System.out.println("Adding money");

	}

	@Override
	public void withdraw_money() {
		// TODO Auto-generated method stub
		System.out.println("withdraw money");

	}

	// methods of implementing class
	public void sum() {

		System.out.println("Summing up values");

	}

}
