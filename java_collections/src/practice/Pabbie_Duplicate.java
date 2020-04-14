package practice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Pabbie_Duplicate {

	static HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

	public static void check_vowel(String str) {

		// looping through string for each character
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);// Storing character value in Charcater type ch
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')// checking ch is a vowel or no {

				// if ch is a vowel check map has it or no, below it checks if it is not there
				// then add with key as Character value 1, ! means not

				if (!hm.containsKey(ch)) {
					hm.put(ch, 1);
					// if character is already there then add + 1 to the previous value of the
					// character
				} else
					hm.put(ch, hm.get(ch) + 1);

		}

		// we cannot access elements inside map directly , or with a for loop so we have
		// to create an entry set
		Set<Entry<Character, Integer>> entryset = hm.entrySet();
		for (HashMap.Entry<Character, Integer> entry : entryset) {
			System.out.println("Character--->" + entry.getKey() + " " + "  has value-->" + entry.getValue());

		}
	}
	
	public static void main(String args[]) {
		
		
		check_vowel("prabha");
	}

}
