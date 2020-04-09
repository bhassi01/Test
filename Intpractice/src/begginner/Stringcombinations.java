package begginner;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Stringcombinations {

	//static String s1 = "Boy";
	//static String s2 ="Girls";
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	


	static String swap(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j, str.charAt(i));
		// System.out.println(sb.toString());
		return sb.toString();
	}
	

	public static void addTomap(String s3) {
		
		if (!map.containsKey(s3)) {
			map.put(s3, 1);
		} else {
			map.put(s3, map.get(s3) + 1);
		}
	}
	
	public  static void Valid_Output(String s1, String s2){
		try {
			int cs1 = s1.length();
			int cs2 = s2.length();
			s1=s1.replace("  ", "");
			s2= s2.replace("  ", "");
			s1 = s1.toUpperCase();
			s2 = s2.toUpperCase();
			String s3 = s1 + s2;
			String s4 = s2 + s1;
			int t = s1.length() - 1;
			int m = t;
			int n = s2.length() - 1;
			int o = n;
			int count = 0;
			//System.out.println(s3);
			//addTomap(s3);
			//addTomap(s4);
			//System.out.println(s4);

			if (cs1 == 0 || cs2 == 0) {
				System.out.println("Either of the strings is empty, please check input");
			}

			

			for (int i = 0; i < s1.length(); i++) {

				// System.out.println("INSIDE LOOP with value of i----" + i);
				// System.out.println("Value at s3 character--->" +" at "+i +"is
				// "+s3.charAt(i));

				for (int j = 0; j <= cs2; j++) {
					if (count <= s2.length() - 1) {

						// System.out.println("Inside loop 2");
						// System.out.println("Value of j is " + j);
						// System.out.println("Value of t is" + t);
						// System.out.println("Value of m is" +m);
						// System.out.println(s3);
						// System.out.println(s3.charAt(t));
						System.out.println("Character --" + s3.charAt(t) + "   being swapped by  " + s3.charAt(t + 1));
						s3 = swap(s3, t, t + 1);
						System.out.println(s3);
						++t;
						++count;
						addTomap(s3);
						// System.out.println("count is" + count);
					} else {
						// System.out.println("Hi");
						count = 0;
						t = --m;
					}

				}

			}
			for (int i = 0; i < s2.length(); i++) {

				// System.out.println("INSIDE LOOP with value of i----" + i);
				// System.out.println("Value at s3 character--->" +" at "+i +"is
				// "+s3.charAt(i));

				for (int j = 0; j <= cs1; j++) {
					if (count <= s1.length() - 1) {

						// System.out.println("Inside loop 2");
						// System.out.println("Value of j is " + j);
						// System.out.println("Value of t is" + n);
						// System.out.println("Value of m is" +m);
						// System.out.println(s4);
						// System.out.println(s3.charAt(t));
						System.out.println("Character --" + s4.charAt(n) + "   being swapped by  " + s4.charAt(n + 1));
						s4 = swap(s4, n, n + 1);
						System.out.println(s4);
						++n;
						++count;
						addTomap(s4);
						// System.out.println("count is" + count);
					} else {
						// System.out.println("inside else block");
						count = 0;
						n = --o;
					}

				}

			}

			Set<Entry<String, Integer>> entrySet = map.entrySet();
			 System.out.println(map.size());
			for (HashMap.Entry<String, Integer> entry : entrySet) {

				System.out.println(entry.getKey() + "---has value" + entry.getValue());
				if (entry.getValue() > 0) {
					System.out.println("Repeated character --- " + entry.getKey() + " " + "repeated" + " "
							+ entry.getValue() + "  times");
				}

			}
			}
			catch(Exception e){
				
				System.out.println("Either of the string is null, null pointer exception caught");
			}
	}

	
}