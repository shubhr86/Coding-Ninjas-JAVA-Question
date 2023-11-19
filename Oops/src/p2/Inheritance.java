package p2;

 class base {  //class
	
	 // constructor
	 base () {
		 System.out.println("I'm the hero");
	 }
	 
 }
 
 class drived extends base{
	 drived(){
		 System.out.println("i'm drived classs with extended");
	 }
	 

 }
 class childdrived extends drived{
	 childdrived(){
		 System.out.println("i'm child drived classs with extended");
	 }
	 

 }
public class Inheritance {

	public static void main(String[] args) {
		base d= new childdrived();

	}

}
