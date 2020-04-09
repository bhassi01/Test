package practice;

public class palindrome {

	public static int palindrome(int n) {
		int sum = 0;
		int m;

		while (n > 0)

		{
			m = n % 10;
			
			//1-1
			//2-2
			//3-1
			sum = m + (sum * 10);
			//1-1
			//2-2+10=12
			//3-1+(10*12)=121
			n = n / 10;
			//1-12
			//2-1
			//3-0

		}

		return sum;
	}

	public static void main(String args[]) {
		int t = palindrome(121);
		if (t == 121) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

	}

}
