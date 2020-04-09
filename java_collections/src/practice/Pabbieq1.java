package practice;

public class Pabbieq1 {
	public int hashCode()
	{  return 123;}
	
	public boolean equals(Integer ob)
	{
		
		 return this.hashCode()==ob.hashCode();
	}
	
	public static void main (String args[])
	{
		
		Pabbieq1 t= new Pabbieq1();
		System.out.println("Hashcode="+ t.hashCode());
		Pabbieq1 t1= new Pabbieq1();
		String t2 = new String();
		System.out.println("Hashcode="+ t1.hashCode());
		System.out.println(t.equals(t2));
		
		
	}

}
