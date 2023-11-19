package selftest;

import java.util.Arrays;


public class secondLargestNum {
	
	public static int largestNum(int arr[], int n) {
		int seacondlargest= 0;
		if (n < 2) {
			return -1;
		}
		Arrays.sort(arr);
		
		for (int i= n-2; i>=0; i--) {
			if (arr[i]!= arr[n-1]) {
				System.out.println(arr[n-1]);
				seacondlargest= arr[i];
				break;
			}else {
				seacondlargest = -1;
			}
		}
		
		return seacondlargest;
	}

	public static void main(String[] args) {
			int N = 6;
				int Arr[] = {12, 35, 1, 10, 34, 1};
				System.out.println(largestNum(Arr, N));
				
			
	}

}
