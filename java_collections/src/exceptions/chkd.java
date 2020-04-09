package exceptions;

import java.io.IOException;

public class chkd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Inside main method");
		 Demo1 d1 = new Demo1();
		 d1.test3();
		 try {
			d1.test1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
