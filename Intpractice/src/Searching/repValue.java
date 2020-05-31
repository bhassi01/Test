package Searching;

public class repValue {
	
	 static int [] a= {1,2,1,2,3,3};
	   static int count; 
	
	
	public static void main(String args[])
	{
		
		for ( int i=0; i<a.length;i++)// {0,10)
			
			//(1,8)
		 for (int j=i+1;j<a.length;j++) {
			 
			 
			 
			 if(a[i]==a[j])
			 {
				 System.out.println(a[i]); 
				 
			 }
		 }	
			
		}
		
		
	}


