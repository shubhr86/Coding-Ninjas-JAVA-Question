package selftest;

import java.util.Scanner;

public class Number010print {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		
		


		for ( int i=n;i>=1;i--) {
			for (int k=1;k<=n-i;k++) 
				
				System.out.print(" ");
			for (int j=i*2-1;j>=1;j--) {
				int sum=i+j;
				if (sum%2!=0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		
		}
	}
}

