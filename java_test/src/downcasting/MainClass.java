package downcasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting main method");

		System.out.println("--- Printing   upcadted data");
		Sample ref = new Sample_1();
		System.out.println("ref.a");
		ref.test();

		System.out.println("---------------checking downcasted data----");

		Sample_1 ref1 = (Sample_1) ref;
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		ref1.disp();
		ref1.test();

		System.out.println("Downcasting the upcasted Reference variable to parent class");
        Sample ref2 =(Sample) ref;
        System.out.println(ref2.a);
        //System.out.println(ref2.b);
        ref2.test();
       //ref2.disp();
	}

}
