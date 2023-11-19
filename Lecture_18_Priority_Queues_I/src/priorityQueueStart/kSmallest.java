package priorityQueueStart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class kSmallest {
	
	public static ArrayList<Integer> ksmallest (int n, int arr[] , int k){
		ArrayList<Integer> minElements= new ArrayList<>();
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		int i=0;
		 for (; i<k; i++) {
			 pq.add(arr[i]);
		 }
		 for (; i<n; i++) {
			 if (pq.peek() > arr[i]) {
				 
				 pq.remove();
				 pq.add(arr[i]);
			 }
		 }
		 while (!pq.isEmpty()) {
			 minElements.add(pq.remove());
		 }
		 return minElements;
	}

	public static void main(String[] args) {
		int input[]= {5, 2 ,8, 9};
		int k =2;
		System.out.println(ksmallest(input.length, input, k));

	}

}
