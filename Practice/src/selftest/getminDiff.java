package selftest;

import java.util.Arrays;

public class getminDiff {
	
	public static  int getMinDiff(int[] arr, int n, int k) {
		
		Arrays.sort(arr);
		int difference= arr[n-1] -arr[0];
		int min=0, max=0;
		
		for(int i=1; i<n; i++) {
			if (arr[i] - k < 0) 
				continue;
			
			max=Math.max(arr[n-1]-k, arr[i-1]+k);
			min=Math.min(arr[0]+k, arr[i]-k);
			difference= Math.min(difference, max-min);
		}
		return difference;
		
	}

	public static void main(String[] args) {
		int arr[]= {5,3,9,6,2};
		int n =arr.length;
		int k=2;
		System.out.println(getMinDiff(arr, n, k));

	}

}
