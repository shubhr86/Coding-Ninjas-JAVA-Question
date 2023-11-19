package AdvancePatterns;

import java.util.Scanner;

public class PalindromPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for (int i=1;i<=n;i++) {
			int spaces = n-i;
			for (int k=1;k<=spaces;k++)  //spaces loop
				System.out.print(" ");
			// 1st half Numbers printing
				for (int j=i;j>=1;j--) {
					System.out.print(j);
				}
				
				// 2nd half numbers
				for (int j=2;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
		}

	}

}