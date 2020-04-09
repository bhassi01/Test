package practice;

public class s_palindrome {
	static String rev ="";
	
	public static boolean s2(String s)
	{
		
		
		for (int i=s.length()-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);
			System.out.println(rev);
		}
			
			if (s.equals(rev))
			{
				return true;
			}
			
		return false;
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean confirm=s2("prabha");
	System.out.println(confirm);

	}

}
