package selftest;

import java.util.Scanner;

public class tableprint {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		
		for (int i=1;i<=10;i++) {
			
			int product=n*i;
			
			System.out.println(product);
		}

	}

}
