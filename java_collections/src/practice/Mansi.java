package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Mansi {
	static int[][] a = new int[][] { { 1, 3 }, { 1, 5 }, { 2, 6 }, { 5, 9 }, { 2, 8 } };
	static int startpoint, endpoint;
	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static void addvalue(int m) {

		if (map.containsKey(m)) {
			map.put((m), map.get(m) + 1);

		} else
			map.put(m, 1);

	}

	public static void calculatestops() {
		for (int i = 0; i < a.length; i++)

		{
			startpoint = a[i][0];
			endpoint = a[i][1];
			addvalue(startpoint);
			for (int j = startpoint; j < endpoint - 1; j++) {

				++startpoint;
				addvalue(startpoint);

			}

		}

	}

	public static void main(String args[]) {
		calculatestops();
		print();

	}

	public static void print() {
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		int maxValueInMap = (Collections.max(map.values()));
		for (HashMap.Entry<Integer, Integer> entry : entrySet) {
			
			if (entry.getValue()==maxValueInMap) {
				System.out.println("Max usability is of   "+  entry.getKey()+"  "+" with availability for paths ="
			+ entry.getValue());
				
			}

			System.out.println(
					" usablity " + entry.getKey() + " " + "repeated" + " " + entry.getValue() + "  times");

		}

	}
}
