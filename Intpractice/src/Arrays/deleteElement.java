package Arrays;

public class deleteElement {
	
	 static int [] a = {10,20,30,40,50};
	 static int delete =30;

	public static void main(String[] args) {
		 for (int i=0; i<a.length;i++) {
			 if(a[i]==delete) {
				 
				 for ( int j=i; j<a.length-1;j++) {
					 
					 
					 a[j]=a[j+1];
				 }
				 
				 break; 
			 }
			 
	
			 
			 
			 
		 }
		 for( int k:a) {
				
				System.out.print(k +" ");
			}	 
		 
		 

	}

}
