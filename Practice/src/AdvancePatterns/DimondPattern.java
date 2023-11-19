package AdvancePatterns;

import java.util.Scanner;

public class DimondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for (int i=1;i<=n;i++) {
			int spaces = n-i;
			for (int k=1;k<=spaces;k++)  //spaces loop
				System.out.print(" ");
			// 1st half Numbers printing
				for (int j=i;j>=1;j--) {
					System.out.print("*");
				}
				
				// 2nd half numbers
				for (int j=2;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
		}
		// 2nd half of the pattern after row 4
	
		for (int i=n;i>=1;i--) {
			int spaces = n-i;
			for (int k=1;k<=spaces;k++)  //spaces loop
				System.out.print(" ");
			// 1st half star printing
				for (int j=i;j>=1;j--) {
					System.out.print("*");
				}
				
				// 2nd half star from right side
				for (int j=2;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
		}

	}

}
