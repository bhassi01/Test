package java_test.casting;

public class MainClass_2 {
	//Performing downcasting

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d1 = new Demo2();
		
		System.out.println("values from demoa 1" +d1.a);
		d1.Testin_demo1();
		
		System.out.println("Performing Downcasting now");
		if ( d1 instanceof Demo2 )
		{
			Demo2 d2 =(Demo2)d1;
			System.out.println("value of variable from   parent class demo1 is" +d2.a );
			d2.Testin_demo1();
			System.out.println("value of variable from   child class demo1 is" +d2.b);
			d2.test3();
			
			
		}
		

	}

}
