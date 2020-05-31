package begginner;

public class DuplicateInArray {
	public static void main(String args[])
	{		int arr[]= {2,1,5,8,4,5,4,2,3,2};
			int temp[] = new int[(arr.length-1)];
			 int t=0;
			for( int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++)
				{System.out.println("comparing "+arr[i]+" "+arr[j]);
					if(!(arr[i]==arr[j]))
					{ temp[t]=arr[i];
					System.out.println("added value "+arr[i]);
						}
					
					else {
					temp[t]=arr[i];}
					if(t<arr.length-2)
					t++;
				}
				
				
				
			
	}
				for(int k:temp) {
					
					System.out.print(k);
				}
				
			}

	}


