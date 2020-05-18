package string_topics;

//Swap two strings without using third string

public class Program2 {

	public static void swap_string(String s1, String s2) {
		
		if((s1.length()) ==0|| s2.length()==0)
		{
			System.out.println("check your inputs");
		}
		
		int Length1 = s1.length();

		s1 = s1 + s2;
		s2 = s1.substring(0, (Length1 ));
		int Length2 = s2.length();
		s1 = s1.substring(Length2);
		System.out.println("Swapped first string is " + s1);
		System.out.println("Swapped second string is " + s2);
	}

	
	public static void main (String args[])
	{
		swap_string("Happy","Bhaskar");
	}
}
