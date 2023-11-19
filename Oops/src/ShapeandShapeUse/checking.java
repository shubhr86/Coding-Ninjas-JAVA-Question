package ShapeandShapeUse;

class Pens {
	String Colour;
	String Type;
	
	public void printpen() {
		
		System.out.println("Pen Colour");
		

	}
	
	public void printclour() {
		System.out.println(this.Colour);
		
	}
}
 



public class checking {

	public static void main(String[] args) {
		Pens p1= new Pens ();
		p1.Colour= "Black";
		p1.Type= "Gel";
		p1.printclour();
		
		Pens p2= new Pens ();
		p2.Colour= "Blue";
		p2.Type= "Ball";
		p2.printclour();
		
		

	}
	

}
