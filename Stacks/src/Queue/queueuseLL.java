package Queue;

public class queueuseLL {

	public static void main(String[] args) {
		QueueUsingLL quue= new QueueUsingLL<>();
		for (int i=1;i<=5;i++ ) {
			int j= i*2+3;
			quue.enQueue(j);
			quue.enQueue(15);
			quue.enQueue(20);
			quue.enQueue(35);
			
		}
		
		while (!quue.isEmpty()) {
			quue.deQueue();
			
			System.out.print(quue.deQueue()+" ");
		}

	}

}
