package java_test;

public class Param_const {

	int price;
	String name;
	String engine;

	Param_const(String name, int price, String engine)

	{
		this.price = price;
		this.engine = engine;
		this.name = name;

		System.out.println("Car " + name + " is available at" + price + "with engine type" + engine);

	}

//Overloaded Constructor
	Param_const(int price, String name, String engine) {
		this.price = price;
		this.engine = engine;
		this.name = name;

		// TODO Auto-generated constructor stub
		System.out.println("Car " + name + " is available at" + price + "with engine type" + engine);

	}

}
