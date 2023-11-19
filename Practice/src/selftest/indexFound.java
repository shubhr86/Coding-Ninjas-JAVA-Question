package selftest;

import java.util.ArrayList;

public class indexFound {
	
	public static ArrayList<Integer> value(int arr[], int n){
		ArrayList<Integer> ans = new ArrayList<>();
		int i=1;
		while ( i<n ) {
			if (arr[i]==i+1) {
				
				ans.add(arr[i]);
				i++;

			}else {
				
				i++;
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[]= {21,2,45,12,7};
		int n =5;
		ArrayList<Integer> ans = value(arr, n);
		
		if (ans.size()==0) {
			System.out.println("Not Found");
		}else {
			
			for (Integer x :ans) {
				System.out.println(x+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
