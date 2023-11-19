package priorityQueueStart;

import java.util.PriorityQueue;

public class checkMaxHeap {
	
	public static boolean checkMaxHeap(int arr[]) {
		
		
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		int i=0;
		for (; i<arr.length; i++) {
			int parentIndex=i;
			int leftChildIndex = 2*i+1;
			int rightChildIndex=2*i+2;
			if (leftChildIndex < arr.length && arr[parentIndex] < arr[leftChildIndex]) {
				return false;
			}
			if (rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex]) {
				return false;
			}
		}
		
			return true;
			
		
	}

	public static void main(String[] args) {
		int arr[]= {42, 20, 18 ,6, 14 ,11, 9, 4};
		System.out.println(checkMaxHeap(arr));
	}

}
