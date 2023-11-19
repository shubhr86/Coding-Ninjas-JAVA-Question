package classessAndObjects;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber (int real, int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
		
	}
	
	public int getReal (){
		return real;
}
	public int getImaginary() {
		return imaginary;
	}
	
	public int setReal(int real) {
		this.real=real;
		return real;
	}
	public int setImaginary(int imaginary) {
		this.imaginary=imaginary;
		return imaginary;
	}
	public void print() {
		System.out.println(real+"+"+"i"+ imaginary);
	}
	
	public void add(ComplexNumber c2) {
		int real= this.real+ c2.real;
		int imaginary= this.imaginary+ c2.imaginary;
		this.real=real;
		this.imaginary=imaginary;
	}
	public static ComplexNumber add( ComplexNumber c1 , ComplexNumber c2) {
		int newreal= c1.real+c2.real;
		int newimag= c1.imaginary+c2.imaginary;
		ComplexNumber c = new ComplexNumber(newreal, newimag);
		return c;
	}
	
	public void multiply(ComplexNumber c2) {
		
	    this.real=this.real*c2.real;
	    this.imaginary=this.imaginary*c2.imaginary;
	
	}
	
	public static ComplexNumber multiply( ComplexNumber c1, ComplexNumber c2) {
		int real= c1.real*c2.real-c1.imaginary* c2.imaginary;
		int imaginary= c1.real* c2.imaginary+ c2.real* c1.imaginary;
		return new ComplexNumber(real, imaginary);
		
	}
	
}
