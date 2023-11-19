package StackusingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue<T> {
	private Queue<T>q1;
	private Queue<T>q2;
	private int size;
	
	public Queue<T>getQueue(){
		return q1;
	}
	
	public StackUsingQueue() {
		q1= new LinkedList<>();
		q2= new LinkedList<>();
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	public boolean isEmpty() {
		return size ==0;
	}
	public void push(T element) {
		q1.add(element);
		size++;
	}
	
	public T pop() {
//		if (q1.isEmpty()) {
//			return -1;
//		}
		while (q1.size()!=1) {
			q2.add(q1.remove());
		}
		T top= q1.remove();
		while (!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		size++;
		return top;
				
	}
	
	public T top() {
		while (q1.size()!=1) {
			q2.add(q1.remove());
		}
		T top=q1.peek();
		q2.add(q1.remove());
	
	Queue<T> q=  q1;
	q1=q2;
	q2=q;
	return top;
	
	}


}
