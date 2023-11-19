package priorityQueueStart;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class kLargest {
	
	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer> elements= new ArrayList<>();
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		int i=0;
		// putting kth element into PQ
		
		for (; i<k; i++) {
			pq.add(input[i]);
		}
		for (; i<input.length; i++) {
			if (pq.peek() < input[i]) {
			pq.remove();
			pq.add(input[i]);
			}
		}
		while (!pq.isEmpty()) {
			elements.add(pq.remove());
		}
		return elements ;
		
	}

	public static void main(String[] args) {
		int input[]= {5,13,9,8,7,10,12,14};
		int k =3;
		System.out.println(kLargest(input, k));

	}

}
