package Collections;

public class Employees {
	String name;
	 int id;
	 double salary;

	Employees(String name, int id, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {

		return name + " " + id + " " + salary;
	}

	public String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public  int getid() {
		return  this.id;
	}

	public  void setId(int id) {
		this.id = id;
	}

	public  double getSalary() {
		return salary;
	}

	public  void setSalary(double salary) {
		this.salary = salary;
	}

}
