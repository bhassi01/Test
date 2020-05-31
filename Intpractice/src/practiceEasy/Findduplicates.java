package practiceEasy;

import java.util.HashMap;
import java.util.Map;

public class Findduplicates {

	public static void main(String args[]) {

		int array[] = { 2, 1, 5, 2, 3, 6, 4, 7, 8, 5, 9 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {

			if (!(hm.containsKey(array[i]))) {

				hm.put(array[i], 1);

			} else {
				int c = hm.get(array[i]);
				hm.put(array[i], c + 1);

			}

		}
		for(Map.Entry<Integer,Integer> entry:hm.entrySet())
		{
			if(entry.getValue()>1) {
				System.out.println("Element"+entry.getKey()+ " is repeated "+entry.getValue());
				
			}

	}
}}
