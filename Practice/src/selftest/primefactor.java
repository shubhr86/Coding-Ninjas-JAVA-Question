package selftest;

import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		
		if (n==1) {
			System.out.println(1);
		} else if (n==0) {
			System.out.println("No Prime Factors");
		}
		
		for (int i=2; i<=n; i++) {
			if (n%i==0) {
				int p=0;
				for (int j=2; j<i;j++) {
					if (i%j==0) {
						p++;
						break;
					}
				}
				if (p==0) {
					System.out.println(i);
			}
			
			}
		}

	}

}
