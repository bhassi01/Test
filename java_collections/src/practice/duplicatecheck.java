package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicatecheck {

	public static void duplicate(String str) {
		str = str.replace(" ", "");
		System.out.println(str);

		char a[] = str.toCharArray();
		Integer n = a.length;
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(a[i])) {
				mp.put(a[i], mp.get(a[i]) + 1);

			} else {
				mp.put(a[i], 1);

			}
		}
		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (HashMap.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Repeated caharacters are " + entry.getKey() + " " + "repeated" + " "
						+ entry.getValue() + "  times");
			}

		}

	}

	public static void main(String[] args) {

		duplicate("india is mycountry");

	}

}
