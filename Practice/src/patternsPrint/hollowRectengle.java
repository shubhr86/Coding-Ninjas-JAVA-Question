package patternsPrint;

import java.util.Scanner;

public class hollowRectengle {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		
		//Outer Loop
		for (int i=1;i<=n;i++) {
			//Inner Loop
			
			for (int j=1;j<=n+1;j++) {
				
		// Print * only on boundaries and rest spaces only	
				// for Rows 1st row and last row and for cols 1st and last which is i or n (n+1 for j)
				
				if (i==1 || j==1 || i==n || j==n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
