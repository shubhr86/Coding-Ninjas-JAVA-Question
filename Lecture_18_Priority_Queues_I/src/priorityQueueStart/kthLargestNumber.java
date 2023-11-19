package priorityQueueStart;


import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestNumber {
	
	
	public static int kthLargest(int n, int[] input, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i=0;
		for (; i<k; i++) {
			pq.add(input[i]);
		}
		for (i=k; i<input.length; i++) {
			if(input[i] > pq.peek() ) {
				pq.remove();
				pq.add(input[i]);
			}
		}
		return pq.remove();

	}


	

	public static void main(String[] args) {
		int input[]= {2 ,6 ,10, 11, 13 ,4 ,1, 20 };
		int k =4;
		System.out.println(kthLargest(input.length, input, k));
		
	}

}
