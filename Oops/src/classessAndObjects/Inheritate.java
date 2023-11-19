package classessAndObjects;


// Single Level Inheritance example
 class Shape {
	 int l;
	 int h;
	 public void area() {
		System.out.println("Display Area");
	}
 }
 class Traingle extends Shape{
	 public void area(int l, int h) {
		 l=15;
		 h=18;
		System.out.println(1/2*l*h);
	}
 } 
 
// *********** further extends then makes it Multi level Inheritance
 class EqulatteralTraingle extends Traingle {
	 public void area(int l, int h) {
			System.out.println(1/2*l*h);
		}
 }
 
 // ************** Now below Hierarchy | ek hi class ke multiple sub classes
 
 class circle extends Shape{
	 public void area(int r) {
			System.out.println((3.14)*r*r);
		}
 }
 
 //******************** Hybrid ********************************
 
public class Inheritate {

	public static void main(String[] args) {
		Traingle s= new Traingle();
		s.h=15;
		s.l=18;
		s.area();
		

	}

}
