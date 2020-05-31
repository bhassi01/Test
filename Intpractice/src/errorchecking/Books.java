package errorchecking;

class Books {
	 String title;
	 String author;
	
Books(String title,String author){
	this.author= author;
	this.title= title;
	
}
 public  String toString()
 {
	 return this.title +"written by"+ this.author;
 }
}
	
	