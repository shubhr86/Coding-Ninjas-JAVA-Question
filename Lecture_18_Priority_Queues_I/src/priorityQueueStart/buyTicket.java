package priorityQueueStart;

import java.util.Collections;
import java.util.PriorityQueue;

public class buyTicket {
	
	public static int buyTicket(int input[], int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0; i< input.length; i++) {
			pq.add(input[i]);
		}
		int time =0;
		while (!pq.isEmpty()) {
			for (int i=0; i< input.length; i++) {
				if (pq.peek() ==  input[i]) {
					time++;
					pq.remove();
					if (i==k) {
						return time;
				}
						
				}
			}
		}
			return time;
		
	}

	public static void main(String[] args) {
		int input[]= {2 ,3 ,2 ,2 ,4};
		System.out.println(buyTicket(input, 3));
	}

}
