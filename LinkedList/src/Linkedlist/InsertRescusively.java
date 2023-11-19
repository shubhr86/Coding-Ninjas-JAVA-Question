package Linkedlist;

import java.util.Scanner;

public class InsertRescusively {
	public static node<Integer> takeinput() {
		node<Integer> head= null, tail= null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if (head == null) {
				head= newnode;
				tail= newnode;
			}else {
				tail.next= newnode;
				tail= newnode;
			}
			data=s.nextInt();
		}
		return head;
		
	}

	public static void printR(node<Integer> head) {
		if (head == null) {
			return;
		}
		System.out.print(head.data +" ");
		printR(head.next);
	}
	
	
	public static node<Integer> Insertrecrsively(node<Integer> head, int pos, int element) {
		if (pos == 0) {
			node<Integer> newnode= new node<>(element);
			// this is for delete the node	
			//newnode= head.next;
		  newnode.next=head;
			return newnode;
		}
		if (head == null) {
			return head;
		}
		head.next= Insertrecrsively(head.next, pos-1, element);
		return head;
	}
	public static void main(String[] args) {
		node<Integer> head= takeinput();
		head= Insertrecrsively(head, 0, 15);
		printR(head);

	}

}
