package string_topics;

public class Program3 {
	///this program checks that string has only digits

	public static boolean checkdigit_string(String s1) {

		if (s1 == null) {
			return false;
		}

		if (!(s1.isEmpty())) {

			for (int i = 0; i <= s1.length() - 1; i++) {
				if (!Character.isDigit(s1.charAt(i))) {
					return false;

				} else {
					return true;
				}
			}

		}

		return false;

	}

	public static void main(String[] args) {

		boolean data1 = checkdigit_string("true");
		System.out.println(data1);
		boolean data2 = checkdigit_string("11222");
		System.out.println(data2);
		boolean data3 = checkdigit_string("t223rue");
		System.out.println(data3);
		boolean data4 = checkdigit_string("99999999");
		System.out.println(data4);
		boolean data5 = checkdigit_string("Bhaskar@123");
		System.out.println(data5);
		boolean data6 = checkdigit_string(null);
		System.out.println(data6);

	}

}
