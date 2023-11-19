package selftest;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a= s.nextInt();
		int b= s.nextInt();
		int factors=1;
		 for (int i=2; i<=a && i<=b;i++) {
			 if (a%i==0 && b%i==0) 
				 factors=i;
			 }
			 System.out.println(factors);
		 }

	}


