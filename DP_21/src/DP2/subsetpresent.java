package DP2;

import java.util.concurrent.atomic.AtomicBoolean;

public class subsetpresent {

	static boolean isSubsetPresent(int[] arr, int n, int sum) {
		return isSubsetPresent(arr, n, sum ,0);
	}



	public static boolean isSubsetPresent(int[] arr, int n, int sum, int i) {
		if (arr.length==0) {
			return false;
		}
		if (i==arr.length) {
			if (sum==0) {
				return true;


			}else {
				return false;
			}
		}
		boolean op1= isSubsetPresent(arr, n, sum-arr[i], i+1);
		if (op1) {
			return true;
		}else {
			boolean op2= isSubsetPresent(arr, n, sum, i+1);
			return op2;	

		}
	}
	public static boolean isSubsetPresent_DP(int[] arr, int n, int sum) {
		boolean storage[][]= new boolean[sum +1][n+1];
		for (int i=0; i<=n; i++) {
			storage[0][i]=true;
		}
		for (int i=1; i<=sum; i++) {
			storage[i][0]=false;
		}
		for (int i=1; i<=sum; i++) {
			for(int j=1; j<=n; j++) {
				storage[i][j]= storage[i][j-1];
				if ( i >=arr[j-1]) {
					storage[i][j]= storage[i][j] || storage[i-arr[j-1]][j-1];
				}
			}
		}
		return storage[sum][n];
	}


	public static void main(String[] args) {
		int arr[]= {4,3,5,2};
		System.out.println(isSubsetPresent_DP(arr, 4, 13));
	}

}
