package priorityQueueStart;

import java.util.ArrayList;

public class priorityQueue {

	private ArrayList<Integer> heap;
	public priorityQueue() {
		heap= new ArrayList<>();
	}
	boolean isEmpty() {
		return heap.size()==0;
	}
	int size() {
		return heap.size();
	}
	int getMin() throws priorityQueueExemption {
		if (isEmpty()) {
			throw new priorityQueueExemption();
		}
		return heap.get(0);
				
	}
	// insert
	
	void insert(int element) {
		heap.add(element);
		// upward heapify , means element added but is it at right place? if not then push it to right place.
		int childIndex = heap.size() -1;
		int parentIndex= (childIndex-1) / 2;
		
		while (childIndex > 0) {
		if (heap.get(childIndex) < heap.get(parentIndex)) {
			// swap child with parent
			int temp= heap.get(childIndex);
			// setting/ swapping parentindex into child
			heap.set(childIndex, heap.get(parentIndex));
			// swapping parentindex with temp
			heap.set(parentIndex, temp);
			
			// after swap we need it will go futher for root, if the element is minimum even to root
			
			childIndex= parentIndex;
			parentIndex=(childIndex -1) /2;
			}else {
				return;
			}
		}
		
	}
	
	int removeMin() throws priorityQueueExemption {
		if (isEmpty()) {
			throw new priorityQueueExemption();
		}
		// copy last element to root
		int temp= heap.get(0);
		heap.set(0, heap.get(size()-1));
		// remove last element, which is already copied to root
		heap.remove(heap.size()-1);
		int index=0;
		int minIndex=index;
		int leftChildIndex=1;
		int rightchildIndex=2;
		
		while (leftChildIndex < heap.size()) {
		
		// checking root with its right or left child
		if (heap.get(leftChildIndex) < heap.get(minIndex)) {
			minIndex= leftChildIndex;
		}
		// check is right of the root available
		if (rightchildIndex < heap.size()&&  heap.get(rightchildIndex) < heap.get(minIndex)) {
			minIndex= rightchildIndex;
		}
		if (minIndex ==  index) {
			break;
		}else {
		// swapping
		int temp1= heap.get(index);
		heap.set(index, heap.get(minIndex));
		heap.set(minIndex, temp1);
		index= minIndex;
		leftChildIndex = 2* index + 1;
		rightchildIndex = 2* index +2;
			}
		}
		return temp;
	}
	
}
