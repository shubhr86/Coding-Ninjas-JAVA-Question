package AdvancePatterns;

import java.util.Scanner;

public class ButterFly {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		//****************   1st part  **************
		
		// Outer Loop
		
		for (int i=1;i<=n;i++) {
			
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			// print spaces || K variable for spaces
			int spaces= 2*(n-i);
			
			for (int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			
			// for right Left Side Stars Print
				for (int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		
		//**************    2nd part *************************
		
              for (int i=n;i>=1;i--) {
			
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			// print spaces || K variable for spaces
			int spaces= 2*(n-i);
			
			for (int k=1; k<=spaces;k++) {
				System.out.print(" ");
			}
			
			// for right  Side Stars Print
				for (int j=1;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		
		
}

