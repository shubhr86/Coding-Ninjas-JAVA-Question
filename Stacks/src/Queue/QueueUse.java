package Queue;


public class QueueUse {
	


	public static void main(String[] args) throws QueueFullException, QueryEmptyException {
		queueUsingArray queue= new queueUsingArray();
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(25);
		System.out.println("Size of Queue" + queue.size());
		queue.dequeue();
		queue.enqueue(80);
		System.out.println("Size of Queue" + queue.size());

		System.out.println("En queue results "+ queue.dequeue());
		
//		int n=15;
//		for (int i=1;i<=n;i++) {
//			int j=i*2;
//			queue.enqueue(j);
//		}
//
//	
//	while (!queue.isEmpty()) {
//		System.out.print(queue.dequeue()+" ");
//		}
//		System.out.println();
//
//	}
	
	}
	
}
