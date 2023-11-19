package priorityQueueStart;

import java.util.ArrayList;


public class maxPQ {
	
	private ArrayList<Integer> heap;
	 public  maxPQ() {
		 heap= new ArrayList<>();
	 }
	 boolean isEmpty() {
		 return heap.size()==0;
	 }
	 int getSize() {
		 return heap.size();
	 }
	 
	 int getMax() throws priorityQueueExemption {
		 if (isEmpty()) {
			 throw new priorityQueueExemption();
		 }
		 return heap.get(0);
	 }
	 void insert(int element) {
		 heap.add(element);
		 int childIndex= heap.size() -1;
		 int parentIndex= (childIndex-1)/2;
		 
		 while (childIndex > 0) {
			 if (heap.get(childIndex) > heap.get(parentIndex)) {
				 int temp= heap.get(childIndex);
				 heap.set(childIndex, heap.get(parentIndex));
				 heap.set(parentIndex, temp);
				 childIndex = parentIndex;
				 parentIndex= (childIndex-1)/2;
			 }else {
				 return;
			 }
		 }
	 }
	 
	 int removeMax() throws priorityQueueExemption {
		 
		 if (isEmpty()) {
				throw new priorityQueueExemption();
			}
		 int temp= heap.get(0);
		 heap.set(0, heap.get(getSize()-1));
		 heap.remove(heap.size()-1);
		 	int index=0;
			int maxIndex=index;
			int leftChildIndex=1;
			int rightchildIndex=2;
			
		while (leftChildIndex < heap.size()) {
			if(heap.get(leftChildIndex) > heap.get(maxIndex)) {
				maxIndex = leftChildIndex;
			}
			if(rightchildIndex < heap.size() && heap.get(rightchildIndex) > heap.get(maxIndex)) {
				maxIndex = rightchildIndex;
			}
			if (maxIndex == index) {
				break;
			}else {
				int temp1= heap.get(index);
				heap.set(index, heap.get(maxIndex));
				heap.set(maxIndex, temp1);
				index= maxIndex;
				leftChildIndex = 2* index + 1;
				rightchildIndex = 2* index +2;
					}
				}
				return temp;
			}
		
		 
	 }
	


