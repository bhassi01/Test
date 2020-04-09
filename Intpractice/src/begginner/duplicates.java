package begginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.print.DocFlavor.STRING;

public class duplicates {
	//	input: success output: c-2, s-2
	//	input: suces output: print nothing
	//	input: sucer output: print nothing
	//	input: succeccss output: c-4, s-2
	//	input: succcess output: c-2, s-2
	//	input: succecceess output: c-4, s-2, e-2
	//	input: null output: print nothing
	//	input: su  er output: print nothing
	//	input: Ssucer output: s-2
	//	input: su$eccr output: c-2
	//	input: My boss is super crazy guy output: s-2
	//	input: s output: print nothing


	static String string1 = "su  er`";
	static HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
	public static void main(String strgs[]) {



		countduplicates(string1);}
	public static void countduplicates(String str){
		str = str.toLowerCase();
		str=str.replace("  ", "");
		if (str.length()==(0)||str.length()==(1)|| str==null)
		{System.out.println("Input string is empty /null/having single character ");}
		for (int i = 0; i < str.length()- 1; i++) {
			Character a = str.charAt(i);
			Character b = str.charAt(i + 1);
			//System.out.println("INSIDE LOOP");
			if (a==b &&mp.containsKey(a))
			{
				mp.put(a, mp.get(a)+2);
				i=i+1;
			}
			if (a == b && !mp.containsKey(a)) {
				System.out.println("Putting repeated character inside map --" +a );
				mp.put(a, 2);
				i=i+1;} 

			else if(!mp.containsKey(a)){
				System.out.println("Putting non  repeated character inside map --" +a );
				mp.put(str.charAt(i), 0);}


		}




		Set<Entry<Character, Integer>> entrySet = mp.entrySet();
		for (HashMap.Entry<Character, Integer> entry : entrySet) {

			System.out.println(entry.getKey()+ "---has value"+entry.getValue());
			if (entry.getValue() > 0) {
				System.out.println("Repeated character --- " + entry.getKey() + " " + "repeated" + " "
						+ entry.getValue() + "  times");}
			//			else {System.out.println("Non Repeated character-- " + entry.getKey() + " " + "comes" + " "
			//					+ entry.getValue() + "  time");}

		}

	}

}


