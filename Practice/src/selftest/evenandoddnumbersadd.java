package selftest;

import java.util.Scanner;

public class evenandoddnumbersadd {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		int even=0;
		int odd=0;
		for (int i=0; i<n;i++) {
			
			if (i%2==0) {
				even++;
			} else {
				if (i%2!=0) {
					odd=odd+i;
					
				}
				System.out.println(even);
			}
			
		}
		
	}

}
