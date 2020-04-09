package arrays_collections;

public class practice_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Non_primtivearray a[] = new Non_primtivearray[4];
		a[0] = new Non_primtivearray(913552, "Bhaskar", "QE");
		a[1] = new Non_primtivearray(332091, "Pabbie", "QE");
		a[2] = new Non_primtivearray(98979, "Atif", "Dev");
		a[3] = new Non_primtivearray(198979, "Azim", "Chairman");

		for (Non_primtivearray st : a) {
			System.out.println(st);

		}
	}

}
