package java_test;

public class Student {

	public void Take_Notes(Notebook nb1, Pen p1) {

		nb1.open_book();
		p1.write();
		nb1.turn_page();
		nb1.close();
		

	}

	public static void main(String args[]) {
//		System.out.println("Executing in main Page");
//		Student s01 = new Student();
//		Stationary st1 = new Stationary();
//		Notebook book = st1.getNotebook();
//		Pen pen = st1.getpen();
//		s01.Take_Notes(book, pen);

		System.out.println("Main method ended");
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3=s1;
		
		
		if(s1.equals(s2))
		{
			System.out.println("botha re equal");
			
		}
		else {System.out.println("Both are not equal");}
		if(s1.equals(s3))
		{
			System.out.println("both are equal");
			
		}
		
		

	}

}
