package Queue;

public class checkoutput {
	public static void main(String[] args) throws QueueFullException, QueryEmptyException {
	
		int n=10;
	    queueUsingArray q = new queueUsingArray();
	    q.enqueue(0);
	    q.enqueue(1);
	    for (int i = 0; i < n; i++)
	    {
	        int a = q.dequeue();
	        int b = q.dequeue();
	        q.enqueue(b);
	        q.enqueue(a + b);
	        System.out.print(a+" ");
	    }
	}
}
