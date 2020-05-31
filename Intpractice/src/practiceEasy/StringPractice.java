package practiceEasy;

public class StringPractice {
	
	public static void main(String args[])
	{
		
		String s1 ="Hi";
		String s2="Hi";
		s1.concat(" Bhaskar");
		//s2 = s1.concat(" Bhaskar");
		
		String s5= new String ("Hope");
		String s6 ="Hope";
		
		System.out.println(s5.equals(s6));
		System.out.println(s5==s6);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuilder  s3 = new StringBuilder("Hello");
		s3.append(" World");
		System.out.println(s3);
		
		StringBuffer s4 = new StringBuffer("Rekha");
		s4.append(" Suyal");
		System.out.println(s4);
		
		
		
	}
	
	

}
