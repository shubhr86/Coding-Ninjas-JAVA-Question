package selftest;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInarray {
	
	public static ArrayList<Integer> leaders(int arr[], int n){
		ArrayList<Integer> ans= new ArrayList<>();
		int leader= arr[n-1];
		for (int i=n-1; i>=0;i--) {
			if (arr[i] >=leader) {
				leader=arr[i];
				ans.add(arr[i]);
			}
		}
		Collections.reverse(ans);
		return ans;
	}

	public static void main(String[] args) {
		int n=6;
		int arr[]= {16,17,4,3,5,2};
		ArrayList<Integer> ans= new ArrayList<>();
		ans=leaders(arr, n);
		for (int i=0; i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		

	}

}
