package patternsPrint;

import java.util.Scanner;

public class traingle01 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		// Outer Loop
		for (int i=1;i<=n;i++) {
			// Inner Loop
			for (int j=1;j<=i;j++) {
				int sum=i+j;
	// chgecking is it even or not and print accordingly
				if (sum%2==0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			
			System.out.println();
		}

	}

}
