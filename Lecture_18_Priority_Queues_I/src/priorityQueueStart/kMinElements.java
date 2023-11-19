package priorityQueueStart;

import java.util.PriorityQueue;

public class kMinElements {
	
	public static void sortKsorted(int arr[], int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		int i=0;
		// putting all first elements which is lower than kth elements
		for (; i< k; i++) {
			pq.add(arr[i]);
		}
		for (; i<arr.length;i++) {
			// putting the element on which index
			arr[i - k]= pq.remove();
			// adding 1 more element into the list
			pq.add(arr[i]);
		}
		// left elements in the heap, remove 1 by one
		for (int j=arr.length-k; j < arr.length; j++) {
			arr[j]= pq.remove();
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,8,7,4,3,9,2};
		int k =3;
		sortKsorted(arr, k);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
