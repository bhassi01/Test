package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static int counter = 1;

	public static void duplicate(String str) {

		char a[] = str.toCharArray();
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!mp.containsKey(a[i])) {
				mp.put(a[i], 1);

			} else {
				mp.put(a[i], counter++);
			}
		}
			Set<Entry<Character, Integer>> entrySet = mp.entrySet();
			for (Map.Entry<Character, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(
							"Repeated caharacters are " + entry.getKey() + "repeated" + entry.getValue() + "times");
				}
			

		}

	}

	public static void main(String[] args) {
	
		duplicate("Java is");

	}

}
