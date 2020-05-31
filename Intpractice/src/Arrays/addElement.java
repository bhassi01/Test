package Arrays;

public class addElement {
	
	 static int [] a = {1,2,3,4,12,34};
	 static int position =3;
	 static int element =36;
	
	public static void main(String args[]) {
		
		for (int i=a.length-1;i>position-1;i--) {
			a[i]=a[i-1];
			for(int k: a) {
				
				System.out.print(k+" ");
			}
			System.out.println(" ");
			
			}
		a[position-1]=element;
		
		for(int k: a) {
			
			System.out.print(k+" ");
		}
		
	}

}
