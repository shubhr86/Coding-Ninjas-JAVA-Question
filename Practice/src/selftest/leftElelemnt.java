package selftest;

import java.util.Arrays;

public class leftElelemnt {
	
	public static long leftele(long arr[], long n) {
		long start =0;
		long end=n;
		long mid = (start+end) / 2;
		
		long ans =0;
		Arrays.sort(arr);
		for (long i=start; i< end; i++) {
			
			if (arr[(int) mid]-1 > ans) {
				ans= arr[(int) mid];
			}
		}
		return ans;
	}

	
	public static void main(String[] args) {
		long arr[]= {8, 1, 2, 9, 4, 3, 7, 5};
		long n = 8;
		System.out.println(leftele(arr, n));
	}

}
