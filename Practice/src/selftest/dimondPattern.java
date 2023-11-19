package selftest;

import java.util.Scanner;

public class dimondPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		 for (int i=1;i<=n;i++) {
			 for (int k=1;k<=n-i;k++)
				 System.out.print(" ");
				 for (int j=i;j>=1;j--) {
					 System.out.print("*");
				 }
				 for (int j=2;j<=i;j++) {
					 System.out.print("*");
				 
		 }
				 System.out.println();

	}
		 for (int i=n-1;i>=1;i--) {
			 for (int k=1;k<=n-i;k++)
				 System.out.print(" ");
				 for (int j=i;j>=1;j--) {
					 System.out.print("*");
				 }
		 
		 for (int j=2;j<=i;j++) {
			 System.out.print("*");
		 
 }
				 System.out.println();
}
}
}

