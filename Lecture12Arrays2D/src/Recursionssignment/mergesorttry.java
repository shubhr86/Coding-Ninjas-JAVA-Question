package Recursionssignment;

import tryingmyself.printSum;

public class mergesorttry {
	
	public static void mergesorts(int arr[]) {
		
		// base case 
		if (arr.length<=1) {
			return;
		}
		int l= arr.length;
		int mid=l/2;
		
		// making temp array part1 & part2
		
		int part1[]= new int[mid];
		int part2[]= new int [l-mid];
		
		// copying elements into part1 and part2
		
		for (int i=0; i<mid; i++) {
			part1[i]= arr[i];
		}
		int k=0;
		for (int i=mid; i<l;i++) {
			part2[k]=arr[i];
			k++;
		}
		mergesorts(part1);
		mergesorts(part2);
		merge(arr, part1,part2);
	}
	private static void merge(int arr[], int part1[], int part2[]) {
		
		// merging subArrays
		int i=0, k=0,j=0;
		
		while (i<part1.length && j<part2.length) {
			if (part1[i]<part2[j]) {
				arr[k]=part1[i];
				k++;
				i++;
			} else {
				arr[k]= part2[j];
				k++;
				j++;
			}
			
			
		}
		//copying remaning elements, if any-
		while (i<part1.length) {
			arr[k]=part1[i];
			k++;
			i++;
		}
		while (j<part2.length) {
			arr[k]= part2[j];
			k++;
			j++;
		}
	}
	
	public static void printsort(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {5,8,1,3,7,9,12};
		mergesorts(arr);
		printsort(arr);

	}

}
