package java_test.casting;

public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo1 ref = new Upcasrting_1();// Upcasted Object
		// Creating object and reference of same class
		Upcasrting_1 ref1 = new Upcasrting_1();
		
		System.out.println("______**** using upcasted object");
		ref.Testin_demo1();//only super class objects  can be accessed through upcasted objects
		
		//accessing same and super class objects from  normal object
		
		System.out.println("__________**************Using  same class objects");
		ref1.print();
		ref1.Testin_demo1();

	}

}
