package stackusingLL;

import stacks.StackemptyException;

public class StackusingLL<T> {
	
	private Node <T> head;
	private int size;
	
	public StackusingLL(){
		head= null;
		size= 0;
	}
	 int size() {
	
		return size;
		
	} 
	 
	 boolean isEmpty() {
		 return head==null;
	 }
	 
	 
	T top() throws StackemptyException {
		if (head==null) {
			StackemptyException e= new StackemptyException();
			throw e;
		}
		return head.getData();
	}
	
	void push (T element) {
		Node<T> newnode= new Node<T>(element);
		newnode.next= head;
		head= newnode;
		size++;
	}
	
	T pop() throws StackemptyException {
		
		if (head==null) {
			StackemptyException e= new StackemptyException();
			throw e;
		}
		
		
		T tempdata= head.getData();
		
		head= head.next;
		size--;
		
		return tempdata;
	}
}
