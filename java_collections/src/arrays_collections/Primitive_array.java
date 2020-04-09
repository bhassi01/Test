package arrays_collections;

public class Primitive_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int arr[];
		// arr = new int [4];

		int[] arr = new int[4];
		arr[0] = 1;
		arr[2] = 2;
		arr[3] = 3;
		// arr[4] = 4;

		System.out.println("********  ptinting the array with for loop");
		for (int i = 0; i < arr.length; i++)

		{
			System.out.println(arr[i]);

		}

		System.out.println("** printing for each loop");
		for (int z : arr) {
			System.out.println(z);

		}

	}

}
