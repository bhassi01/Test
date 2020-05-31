package Arrays;

public class mergeArrays {

	
	
	 static int [] a= {1,12,2,5,7};
	 static int [] b= {10,20,30,40,50};
	static int alength= a.length;
	 static int blength =b.length;
	 static int clength = alength+blength;
	 static int [] c = new int[clength];
	
	
	public static void main (String args[]) {
		
		
		System.out.println("Inside main method");
		 for (int i=0;i<a.length;i++) {
			 c[i]=a[i];
			 
			 
		 }
		 for (int i=0;i<blength;i++) {
			 
			 c[a.length+i]=b[i];
			 
			 
		 }
		 
		 for(int i:c) {
			 
			 System.out.print(i+" ");
		 }
		
	}
	

}
