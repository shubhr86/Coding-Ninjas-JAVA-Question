package Naturalnumber;


import java.util.Scanner;

public class CalculatePower {
	
	public static int  product(int x, int n) {
		if (n==0) {
			return 1;
		}
	
		return product(x,n-1)*x;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int x= s.nextInt(); //Number 
		int n=s.nextInt(); // Power
		
		System.out.println(product(x, n));
		
	}

}
