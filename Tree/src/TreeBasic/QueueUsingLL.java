package TreeBasic;

import java.util.EmptyStackException;

public class QueueUsingLL<T> {
	private Node <T> front;
	private Node<T> rear;
	private int size;
	
	// if we're not making contructor then it will also fine.
	public QueueUsingLL() {
				size=0;
				front=null;
				rear= null;
				
	}
	
	int size() {
		return size;
	}
	boolean isEmpty() {
		return size==0;
	}
	
	T front() throws QueryEmptyException{
		if (size==0) {
			throw new QueryEmptyException();
		}
		return front.getData();
		
	}
	
	void enQueue(T element) {
		Node<T> newnode= new Node<>(element);
		// if its 1st element/ Node
		if (rear==null) {
			front=newnode;
			rear=newnode;
			
		} 
		// when enqueue 2nd node
		else {
			rear.next= newnode;
			rear=newnode;
		}
		size++;
	}
	
	T deQueue() {
		if (size==0) {
			throw new EmptyStackException();
		}
		T temp= front.getData();
		front = front.next;
		if (size==1) {
			rear=null;
		}
		size--;
		return temp;
		
	}
}
