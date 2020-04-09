package practice;

public class count {
	static int i = 0;

	public static void count(int n) {

		System.out.println(i);
		i = ++i;
		if (i == (n + 1)) {
			System.out.println("all elements printed");

		} else {
			count(n);
		}

	}

	public static void main(String[] args) {
		count(99);

	}

}
