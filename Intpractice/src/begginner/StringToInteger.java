package begginner;

public class StringToInteger {
	public static void main(String args[]) {
		
		String str= "123";
		Integer n1 = Integer.parseInt(str);
		System.out.println(n1);
		Integer n2 = Integer.valueOf(str);
		System.out.println(n1);
		
	}

}
