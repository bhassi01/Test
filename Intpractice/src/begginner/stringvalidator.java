package begginner;

public class stringvalidator {
	  public static boolean validate(String s1, String s2, String Test_Output)
	  {
		   Stringcombinations.Valid_Output( s1,s2);
		  if( Stringcombinations.map.containsKey(Test_Output)){
			  return true;}
			  
			  
		  
		  else return false;
		  
	  }
	
	public static void main (String args[])
	{
	Boolean check1=	validate("Boy","GIRL","GBYIROL");
	Boolean check2 =	validate("BOY","GIRL","GIRBLOY");
	 System.out.println(check1);
	 System.out.println(check2);
		
		
	}

}
