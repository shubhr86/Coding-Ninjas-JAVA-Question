package test2;

import java.util.Scanner;
import java.util.Stack;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class nextnumber {

	public static LinkedListNode<Integer> takeInput() {
		LinkedListNode<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head){
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();
	}
	
	
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		Stack<Integer> stack = new Stack<>();
		LinkedListNode<Integer> temp=head;
		while (temp.next!=null) {
			stack.push(temp.data);
			temp=temp.next;
		}
		if (temp.data + 1 <10) {
			temp.data= temp.data + 1;
			return head;
		}
		stack.push(temp.data);
		temp= null;
		int carry=1;
		while (!stack.isEmpty() && carry !=0) {
			int result = stack.pop()+ carry;
			LinkedListNode<Integer> newnode= new LinkedListNode(result %10);
			newnode.next= temp;
			temp= newnode;
			carry= result/10;
		}
		if (carry==0)
			return temp;
		LinkedListNode<Integer> newnode= new LinkedListNode(1);
		newnode.next=temp;
		return newnode;
	}

	public static void main(String[] args) {

		LinkedListNode<Integer> head= takeInput();
		head= nextLargeNumber(head);
		print(head);

	}

}
