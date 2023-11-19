package StackArray;

 class Node{
	 int data;
	 Node next;
	 public Node (int data) {
		 this.data= data;
		 next= null;
	 }
}

 
public class stackUsingArray {
	

	
	public static Node head;
	
	public static boolean isEmpty() {
		return head==null;
	}

	public static void push(int data) {
		Node newnode= new Node(data);
		if (head==null) {
			head= newnode;
			return;
		}
		newnode.next = head;
		head= newnode;
	}
	
	public static int pop() {
		if (isEmpty()) {
			return -1;
		}
		int top= head.data;
		head= head.next;
		return top;
	}
	public static int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}
}
