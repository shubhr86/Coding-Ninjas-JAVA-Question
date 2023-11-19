package Queue;

public class queueUsingArray {
	// basic features every QueueUsing Array
	private int data[];
	private int size;
	private int front;
	private int rear;
	
	public queueUsingArray() {
		data= new int [10];
		size=0;
		rear=-1;
		front=-1;
		
	}
	
	// if user want insert Array
	public queueUsingArray(int capacity) {
		data= new int [capacity];
		size=0;
		rear=-1;
		front=-1;
		
	}
	
	// for size 
	
	int size() {
		return size;
	}
	// for query Empty
	boolean isEmpty() {
		return size==0;
		
	}
	
	// for front
	
	int front() throws QueryEmptyException {
		// if size 0 there is no front element
		if (size==0) {
		throw new QueryEmptyException();
			
		
			
		}
		return data[front];
	}
	private void dynamicQueue() {
		
		int temp[]= data;
		data=new int [temp.length * 2];
		int index =0;
		// copy elements as they comes in the array
		// like 1st element at 0 index and so on
		for (int i= front;i<temp.length;i++) {
			data[index]= temp[i];
			index++;
		}
		// after copy 1st two element some elements lefts. So for that i start with 0 and go till front -1
		
		for (int i=0;i<front-1; i++) {
			data[index]= temp[i];
			index++;
		}
		front =0;
		rear= temp.length-1;
		
	}

	// for adding element into Queue
	
	void enqueue(int element) throws QueueFullException {
		if (size == data.length) {
			// throw new QueueFullException();
			// Dynamic Queue	
						dynamicQueue();
		}
		if (size ==0) {
			front=0;
		}
		size++;
		rear++;
		// circular rear
		if (rear== data.length) {
			rear=0;
			// another way|  rear =(rear+1) % data.length;
		}
		data[rear]= element;
	}
	
	// for Deleting element into Queue
	
	 int dequeue() throws QueryEmptyException {
		 if (size==0) {
				throw new QueryEmptyException();
			}
		 
		 // Store front element into temp and then print it after 
		 // adding front and decrease size
		 
		 int temp= data[front]; 
		 front++;
		 if (front== data.length) {
			 front =0;
		 }
		 size--;
		 // if size is empty then we should need to reset the front and rear
		 if (size==0) {
			 front=-1;
			 rear=-1;
		 }
		 return temp;
	 }
	 
	 

}
