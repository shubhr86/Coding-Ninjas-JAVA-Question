package selftest;

import java.util.Scanner;

public class sumofNumber_Recusrive {
	
	public static int sum(int n) {
		if ((n/10) ==0) {
			return n;
		}else {
			return sum(n/10)+(n%10);
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		System.out.println(sum(n));

	}

}
