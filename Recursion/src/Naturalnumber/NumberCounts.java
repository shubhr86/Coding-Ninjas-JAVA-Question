package Naturalnumber;

import java.util.Scanner;

public class NumberCounts {
	public static int  count(int n) {
		if (n==0) {
			return 0;
		}
		int small= count(n/10);
		int ans = small +1 ;
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
				System.out.println(count(n));

	}

}
