package java_collections;

public class Student {

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return +this.id + " " + this.name;

	}

}
