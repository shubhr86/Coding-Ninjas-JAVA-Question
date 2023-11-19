package selftest;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		int product=1;
		for (int i=1;i<=n;i++) {
			 product= product*i;
		}
		if (n!=0) {
			System.out.println(product);
		} else {
			System.out.println(0);
		}
		

	}

}
