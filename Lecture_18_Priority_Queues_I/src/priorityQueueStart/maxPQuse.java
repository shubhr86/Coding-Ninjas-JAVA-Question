package priorityQueueStart;

public class maxPQuse {

	public static void main(String[] args) throws priorityQueueExemption {
		maxPQ pq= new maxPQ();
		int arr[]= {20,15,18,9,7,5,4,2,22};
		for (int i=0; i <arr.length; i++) {
			pq.insert(arr[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.removeMax()+ " ");
		}
		System.out.println();

	}

}
