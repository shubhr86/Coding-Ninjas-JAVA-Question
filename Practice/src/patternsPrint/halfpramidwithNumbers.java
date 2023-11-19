package patternsPrint;

import java.util.Scanner;

public class halfpramidwithNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		
		//outer Loop
		
		for (int i=1;i<=n;i++) {
			// Inner loop
				System.out.println("");
				for (int j=1;j<=i;j++) {
					System.out.print(j);
				}
			
			}
			System.out.println();
		}

	}


