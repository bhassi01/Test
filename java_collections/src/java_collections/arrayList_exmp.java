//package java_collections;
//
//import java.util.ArrayList;
//
//import arrays_collections.Employee;
//public class arrayList_exmp {
//	
//	
//	public static void main( String args[]) { 
//		
//	ArrayList ao = new ArrayList();
//	Student s1 = new Student (123,"Bhassi");
//	Student s2 = new Student (45,"Atif");
//	//Employee e1 = new Employee(456,"Dev");
//	// e2 = new Employee(789,"QE");
//
//	ao.add(s1);
//	ao.add(s2);
//	//ao.add(e1);
//	//ao.add(e2);
//	
//	System.out.println("******************** printing through  for each");
//	for(Object a:ao)
//	{
//		System.out.println(a);
//		
//	System.out.println("******************** printing through  using instance of");
//	
//	if ( a instanceof Student)
//	{
//		
//		Student st = (Student) (a);
//		
//		System.err.println(st.id + "  " + st.name);
//		}
//	
//	if ( a instanceof Employee)
//	{
//		
//		//Employee emp = (Employee) (a);
//		
//		//System.err.println(emp.empid+ "  " + emp.name);
//		}
//	}
//	
//	
//	}
//	
//
//}
