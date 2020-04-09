package arrays_collections;

public class Non_primtivearray {

	int id;
	String name;
	String dept;

	Non_primtivearray(int id, String name, String dept) {

		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	//

	// ****this string function id called automatically while running System.out
	// *****
	public String toString() {
		return this.id + " " + this.name + " " + this.dept;
	}
}
