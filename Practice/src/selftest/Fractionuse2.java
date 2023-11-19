package selftest;

class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator , int denominator) {
		this.numerator=numerator;
		if (denominator == 0) {
			
			//error
		}
		this.denominator =denominator;
	}
	
	public void print(){
		if (denominator ==1) {
			System.out.println(numerator);
		} else 
		System.out.println(numerator + "/"+ denominator);
	}
	
	public int getnumerator() {
		return numerator;
	}
	 public int getdenoimator() {
		 return denominator;
	 }
	 
	 public void setnumerator(int n) {
		 this.numerator=n;
		 
	 }
	 public void setdenoimator (int d) {
		 if (d==0) {
			 return;
		 } this.denominator=d;
	 }
	 
	 // for to make sure f1 is going to same | not change
	 public static Fraction add(  Fraction f1, Fraction f2) {
		 int newnum= f1.numerator * f2.denominator + f2.numerator* f1.denominator;
		 int newden= f1.denominator*f2.denominator;
		 Fraction f= new Fraction(newnum, newden);
		return f;
	 }
	 public void add(Fraction f2) {
		 this.numerator= this.numerator * f2.denominator + this.denominator* f2.numerator;
		 this.denominator= this.denominator* f2.denominator;
	 }
	 
	 public void multiply(Fraction f2) {
		 this.numerator= this.numerator * f2.numerator;
		 this.denominator= this.denominator * f2.denominator;
				 
	 }
}

public class Fractionuse2{

	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 2);
//	f1.setdenoimator(10);
//	f1.setnumerator(5);
//	f1.print();
		Fraction f2 = new Fraction(4, 5);
//		f1.add(f2);
//		f1.print();
//		f2.print();
		Fraction f3 =  Fraction.add(f1, f2);
		
		
//		f3.print();
		
		Fraction f4 = new Fraction(3, 2);
		f4.multiply(f2);
		f3.print();
		f4.print();
	

				

	}

}

