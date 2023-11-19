package patternsPrint;

import java.util.Scanner;

public class invertPramid {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		// outer Loop
		for (int i=1;i<=n;i++) {
			// Loop for Spaces
			for (int k=1;k<=n-i;k++)
				System.out.print(" ");
			//inner Loop for stars
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
