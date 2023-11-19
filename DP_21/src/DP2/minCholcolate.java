package DP2;


public class minCholcolate {

	public static int getMin(int arr[], int n){
		int storage []= new int [arr.length];
		// base case 
		
		storage[0]=1;
		 for (int i=1; i<arr.length; i++) {
			 if (arr[i] > arr[i-1]) {
				 storage[i]= 1+ storage[i-1];
			 }else {
				 // next elelement is not bigger so we give 1 chocolate
				 storage[i]= 1;
			 }
		 }
		 // left to right 
		  for (int i=arr.length-2; i>=0; i--) {
			  if (arr[i] > arr[i+1] && storage[i] <= storage[i+1]) {
				  storage[i]= 1+ storage[i+1];
			  }
		  }
		  int min=0;
		  for (int i=0; i<storage.length; i++  ) {
			  min+=storage[i];
		  }
		  return min;
	}
	public static void main(String[] args) {
		int arr[]= {1,4,4,6};
		System.out.println(getMin(arr, 4));
	}
}
