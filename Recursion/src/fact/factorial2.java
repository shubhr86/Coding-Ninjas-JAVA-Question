package fact;

import java.util.Scanner;

public class factorial2 {
	
	public static int factorial(int n) {
		int sum=0;
		if (n==0) {
			return 1;
		}
		int smallans= factorial(n- 1);
		sum= smallans * n;
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));

	}

}
