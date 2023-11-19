package selftest;

import java.util.Arrays;

public class kthsmallestElement {
	
	 public static int kthSmallest(int[] arr, int l, int r, int k) {
		 
		 Arrays.sort(arr);
		 return arr[k-1];
	 }

	public static void main(String[] args) {
		int arr[]= {12};
		System.out.println(kthSmallest(arr, 0, 1, 1));

	}

}
