package begginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortstring {

	static String  str = "string124";
	static ArrayList<Character> al =  new ArrayList<Character>() ;


	public static void sort(String s)
	
	{ 
		//char ch1[]= new char [str.length()];
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		for (int i=0;i<str.length();i++)
		{
			
			System.out.println(ch[i]);
		}
		System.out.println();
		
		
		//Method 2
//		for (int i =0;i<s.length();i++) {
//			al.add(s.charAt(i));
//			 System.out.println(s.charAt(i));
//			}
//
//	
//		Collections.sort(al);
//		
//		System.out.println(al);
//		  for (Object ob:al)
//		  { System.out.println(ob);}
//
//
//	}
	}
	
	 public static void main( String [] args) {
		 
		 sort(str);
	 }

}

