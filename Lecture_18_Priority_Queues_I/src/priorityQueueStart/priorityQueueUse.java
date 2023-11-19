package priorityQueueStart;

public class priorityQueueUse {

	public static void main(String[] args) throws priorityQueueExemption {
		priorityQueue pq= new priorityQueue();
		int arr[]= {5,8,0,4,2,1,9,7};
		for (int i=0; i < arr.length; i++) {
			pq.insert(arr[i]);;
		}
		while (!pq.isEmpty()) {
			System.out.print(pq.removeMin()+ " ");
		}
		System.out.println();
	}

}
