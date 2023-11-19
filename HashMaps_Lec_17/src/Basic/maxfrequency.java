package Basic;


import java.util.*;
import java.util.HashMap;

public class maxfrequency {
	
	public static int maxfrequecy(int arr[]) {
		
		HashMap<Integer, Integer> number = new HashMap<>();
		
		for (int i=0; i< arr.length; i++) {
			if (number.containsKey(arr[i])) {
				number.put(arr[i], number.get(arr[i])+1);
			}else {
				number.put(arr[i], 1);
			}
		}
		int count =0;
		int maxnumber= Integer.MIN_VALUE;
		for (int i=0; i<arr.length;i++) {
			if (number.get(arr[i]) > count) {
				count = number.get(arr[i]);
				maxnumber = arr[i];
			}
		}
		return maxnumber;
	}

	 public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }

	        System.out.println();
	    }
	public static void main(String[] args) {
		int arr[]= {1,8,3,2,1,5,8,1};
		System.out.println(maxfrequecy(arr));
	}

}
