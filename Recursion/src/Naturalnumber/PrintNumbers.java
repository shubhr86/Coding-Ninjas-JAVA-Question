package Naturalnumber;

import java.util.Scanner;

public class PrintNumbers {
	public static void printnum(int n) {
		
		if (n==0) {
			return;
		} 
		
		printnum(n-1);
		
		System.out.print(n+" ");


	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int n= s.nextInt();
		printnum(n);
		

	}

}
