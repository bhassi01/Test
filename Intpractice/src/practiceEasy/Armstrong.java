package practiceEasy;

public class Armstrong {

	
	public static void main(String args[])
	{
		
		int no = 123;
		 int temp=no;
		 int sum=0;
		 System.out.println(" the number is "+ no);
		
		while(no>0) {
			 int x= no%10;
			  sum= sum*10+x;
			  no=no/10;
			   System.out.println(sum);
			  
			}
		if (temp==sum) {
			System.out.println("No is armstrong");
		}
		else
		{
			System.out.println("No is not armstrong");
			
		}
		
		
		
	}
}
