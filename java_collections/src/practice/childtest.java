package practice;

public class childtest extends test 
{
	int a=25;
//	  public void add(int a,int b)
//	  {
//		  int c=a*b;
//		  long d=c;
//		  System.out.println(d);
//		  
//	  }
	  public void mutltiply(int a,int b)
	  {
		  int c=a-b;
	  }
	   public void test1(test t1)
	   {
		   System.out.println("Iam a pass by ref methodtype");
	   }
	  
	  public static void main(String[] args)
	  {
		  test t=new test();
		  childtest t2=new childtest();
		  //t2.add(2, 3);
		 // t.mutltiply(2, 3);
		  //t.a=45;
		  //int d=t.a;
		  //System.out.println(d);
		  t2.test1(new test());
		  //test ok = new test();
		  //t2.test1(ok);
	  }
}
