package priorityQueueStart;

import java.util.Collections;
import java.util.PriorityQueue;

public class median {
	
	public static void medianprint(int arr[]) {
		PriorityQueue<Integer> min= new PriorityQueue<>();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i: arr) {
			if (max.isEmpty()) {
				max.add(i);
			}
			// if next element smaller than max peek
			else if (i > max.peek()) {
				min.add(i);
				// if the difference is more than 1 then remove from the min add the element to max
				if (min.size() - max.size() > 1) {
					int p = min.remove();
					max.add(p);
				}
			}
			else if (i<  max.peek()) {
				max.add(i);
				if (max.size() - min.size() > 1) {
					int p = max.remove();
					min.add(p);
				}
			}
			if (max.size() > min.size()) {
				System.out.println(max.peek());
			}
			else if (min.size() > max.size()) {
				System.out.println(min.peek());
			}
			else {
				System.out.println((min.peek()+ max.peek())/2);
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {6 ,2 ,1 ,3 ,7 ,5};
		medianprint(arr);

	}

}
