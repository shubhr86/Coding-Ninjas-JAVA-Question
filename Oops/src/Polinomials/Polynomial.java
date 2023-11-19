package Polinomials;

public class Polynomial {
	
	private int [] coeff;
	private int degree;
	
	public Polynomial () {
		coeff= new int [5];
		degree= -1;
	}
	
	// Making Settter
	
	public void setCoefficient (int degree, int Coefficient) {
		
		if (degree>= coeff.length) {
			resturcture(degree);
		}
		coeff[degree]= Coefficient;
		if (degree>= this.degree) {
			this.degree=degree;
		}
	}
	
	// adding polynomial
	
	public Polynomial add(Polynomial p) {
		Polynomial x =new Polynomial();
		 int i=0; int j=0; int k =0;
				
		 while (i< p.coeff.length && j< this.coeff.length) {
			 x.setCoefficient(k, p.coeff[i]+ this.coeff[i]);
			 i++;
			 j++;
			 k++;
		 }
		 while (i< p.coeff.length) {
			 x.setCoefficient(k, p.coeff[i]);
			 k++;
			 i++;
			 
		 }
		 while (j<this.coeff.length) {
			 x.setCoefficient(k, this.coeff[j]);
			 k++;
			 j++;
		 }
		 return x;
	}
	
	// subtract polynomial
	
	public Polynomial subtract (Polynomial p) {
		Polynomial x= new Polynomial();
		int i=0,j=0, k=0;
		while (i< p.coeff.length && j < this.coeff.length) {
			x.setCoefficient(k, this.coeff[i]- p.coeff[i]);
			i++;j++; k++;
		}
		
		while (i< p.coeff.length) {
			x.setCoefficient(k, -p.coeff[i]);
			k++; i++;
		}
		while (i< this.coeff.length) {
			x.setCoefficient(k, this.coeff[j]);
			k++;
			j++;
		}
		
		return x;
				
	}
	
	// Multiply
	
	public Polynomial multiply (Polynomial p) {
		Polynomial x = new Polynomial();
		
		for (int i=0; i<p.coeff.length;i++) {
			for (int j =0; j<this.coeff.length; j++) {
				if (i +j <=x.degree)
					x.setCoefficient(i+j, x.coeff[i+j]);
				else 
					x.setCoefficient(i+j, p.coeff[i]);
			}
		}
		return x;
				
	}
	// Print
	
	public void print() {
		for (int i=0; i<coeff.length;i++) {
			if (coeff[i]!=0)
				System.out.println(coeff[i]+ "x"+ i+ " ");
		}
	}
	
	//Restructure
	
	private void resturcture (int degree) {
		int [] temp =coeff;
		coeff= new int [degree + 1];
		for ( int i=0; i<temp.length;i++) {
			coeff[i]= temp[i];
		}
	}

}
