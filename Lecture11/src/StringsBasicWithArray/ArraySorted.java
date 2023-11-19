package StringsBasicWithArray;

public class ArraySorted {
	
	public static boolean isArraysorted(int arr[], int startindex) {
		if ( startindex== arr.length-1) {
			return true;
		}
		
		if (arr[startindex] < arr[startindex + 1]) {  //Array is sorted till Now
			
			return isArraysorted(arr, startindex + 1);
			
		} else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4};
		System.out.println(isArraysorted(arr, 0));

	}

}
