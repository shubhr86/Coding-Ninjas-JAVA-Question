package patternsPrint;

import java.util.Scanner;

public class FlyoidTraingle {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		int number =1;
		
		for (int i=number;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++; // increase number for 2nd time it will 2 and then 3 & so on...
			}
			System.out.println();
		}

	}

}
