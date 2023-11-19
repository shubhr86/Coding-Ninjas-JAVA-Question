package selftest;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateElements {
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
		
		ArrayList<Integer> ans= new ArrayList<Integer>();
		int temp=-1;
		Arrays.sort(arr);
		for (int i=0; i<n-1; i++) {
			if (arr[i]==arr[i+1] && temp!=arr[i]) {
				temp=arr[i];
				ans.add(arr[i]);
				
			}
		}
			if(ans.size()==0) {
				ans.add(-1);
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,3,1,2,3};
		int n =5;
		System.out.println(duplicates(arr, n));

	}

}
