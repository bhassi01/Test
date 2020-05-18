import java_test.Geek;

public class  Geek_Test  {
	
	public static void main (String[] args) 
	    { 
	      
	        // creating the Objects of Geek class. 
	        Geek g1 = new Geek("aa", 1); 
	        Geek g2 = new Geek("aa", 1); 
	        System.out.println(g1.id);
	        System.out.println(g1.hashCode());
	        System.out.println(g2.hashCode());
	        System.out.println(g1==g2);
	        System.out.println(g1.equals(g2));
	        System.out.println(g2.id);
	          
	        // comparing above created Objects. 
	        if(g1.hashCode() == g2.hashCode()) 
	        { 
	  
	            if(g1.equals(g2)) { 
	                System.out.println("Both Objects are equal. "); }
	            else {
	                System.out.println("Both Objects are not equal. "); }
	      
	        } 
	        else
	        System.out.println("Both Objects are not equal. ");  
	    } 

}
