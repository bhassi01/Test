package Group_Questions;

import java.util.HashMap;

public class question_3 {
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	static int[] a = new int[] { 0,7,9,1, 0, 2, 3, 4, 6, 5 };
	static int counter;

	public static void main(String atgs[]) {
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], 1);
		}
		for (int i = 0; i < a.length; i++) {

			if (map.containsKey(a[i] + 1)) {
				counter++;
			}
		}
		System.out.println(counter);

	}
}