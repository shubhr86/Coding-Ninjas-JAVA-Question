package selftest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arrayIndex_Sum {
	
	public static ArrayList<Integer> sumIndex(int arr[], int n , int s ){
		ArrayList<Integer> ans= new ArrayList<>();
	 if (s==0) {
		 ans.add(-1);
		 return ans;
		 }
	 int sum = arr[0];
		 int i=0, j=0;
		 while(j<n) {
		 if (sum==s) {
			 ans.add(i+1);
			 ans.add(j+1);
				 return ans;
			 }else if (sum <s) {
			 j++;
			 if (j<n) {
				 sum+=arr[j];
			 }
			 }else {
			 sum-=arr[i];
			 i++;
		 }
		 }
		 ans.add(-1);
		 return ans;
	}
		
	

	public static void main(String[] args) {
		int arr[] ={1,2,3,4,5};
		int n=5;
		int s=9;
		System.out.println(sumIndex(arr, n, s));

	}

}
