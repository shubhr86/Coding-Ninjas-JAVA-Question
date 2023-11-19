package Recursionssignment;

public class binarysearchrecusrion {
	
	public static int binarysearch(int arr[], int si, int ei, int x) {
		// base case 
		if (si>ei) {
			return -1;
		}
		// calculate mid index first
		int midindex= (si+ei)/2;
		if (arr[midindex]==x) {
			return midindex;
		} else if (arr[midindex]< x) {
			return binarysearch(arr,si, midindex-1, x);
		} else {
			return binarysearch(arr, midindex+1, ei, x);
		}
	}

    

	public static void main(String[] args) {
		int arr[]= {5,8,2,9,15,2,3};
		int x=9;
		int si=0;
		int ei=arr.length-1;
		System.out.println(binarysearch(arr, si, ei, x));

	}

}
