package AdvancePatterns;

import java.util.Scanner;

public class NumberPramid {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for (int i=1;i<=n;i++) {
			int spaces=(n-i);
			
			for (int k=1;k<=spaces;k++) 
				System.out.print(" ");
				for (int j=1;j<=i;j++) {
					System.out.print(i+" ");
				
				}
				System.out.println();
			}
			
		}

	}


