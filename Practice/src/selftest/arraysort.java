package selftest;

import java.util.Arrays;

public class arraysort {
	
	 public static void sort012(int arr[], int n) {
		// first in build sort function in JAVA
		 
	//   Arrays.sort(a);
	
	
		 int low=0; 
	        int mid=0;
	        int high=n-1;


	        while(mid<=high){
	            if(arr[mid]==0){
	                int temp=arr[low];
	                arr[low]=arr[mid];
	                arr[mid]=temp;
	                low++;
	                mid++;


	            }else if(arr[mid]==1){
	                mid++;


	            }else{
	                int temp=arr[high];
	                arr[high]=arr[mid];
	                arr[mid]=temp;
	                high--;
	            }
	        }
	        return;
	    }
	
			

	    

	public static void main(String[] args) {
		int a[]= {0,2,1,2,0,8};
		int n = a.length ;
		for (int i=0; i<n; i++) {
			sort012(a, n);
		}
		;
	}

}
