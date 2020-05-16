package Group_Questions;

public class Animal {

	public String  no;
	public String  name;
	public String type;

	Animal( String no, String name,String type){

		this.no=no;
		this.name = name;
		this.type =type;
	}
	public String toString() {

		return this.no  +"  " + this.name+" "+this.type;
	}
	public static void main(String args[])
	{

Animal[][] animal=new Animal [3][3];
animal[0][1]=  new Animal("1","tuffey","Dog");
animal[0][2]=new Animal("2","oscar","Cat");
animal[0][3]= new Animal("3","rab","Rabbit");
for(Animal[] an:animal){
System.out.println(an);}

	}



}
