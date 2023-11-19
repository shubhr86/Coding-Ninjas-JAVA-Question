package Naturalnumber;

import java.util.Scanner;

public class factorialofN {
	
	public static  int fact(int n) {
		if (n==0) {
			return 1;
		}
		return fact(n-1) *n;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		System.out.println(fact(n));
				

	}

}
