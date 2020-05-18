package string_topics;

public class Program1 {
	// program checks basics of String

	static String s1 = "Hi";
	static String s2 = "Hi";
	static String s3 = new String(s2);
	static String s4 = new String("Hi");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s1 == s2);// TRUE
		System.out.println(s1.equals(s2));// True
		System.out.println(s2 == s3);// False
		System.out.println(s2.equals(s3));// True
		System.out.println(s1.equals(s4));// True
		System.out.println(s1 == s4);// False
		System.out.println(s1 + s2);
		s1=s1+s2;
		System.out.println(s1);

	}

}
