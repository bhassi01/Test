package practice;

public class test 
{
  int a=25;
  public void add(int a,int b)
  {
	  int c=a+b;
	  System.out.println(c);
	  
  }
  public void mutltiply(int a,int b)
  {
	  int c=a*b;
  }
  
  public static void main(String[] args)
  {
	  test t=new test();
	  childtest t2=new childtest();
	  test r=new childtest();
	  t2.add(2, 3);
	  t.add(2, 3);
	  t.mutltiply(2, 3);
	  t.a=45;
	  int d=t.a;
	  System.out.println(d);
  }
}
