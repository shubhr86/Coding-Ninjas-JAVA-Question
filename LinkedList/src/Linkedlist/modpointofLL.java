package Linkedlist;

import java.util.Scanner;

public class modpointofLL {
	
	public static node<Integer> takeinput() {
		node<Integer> head=null, tail=null;
		Scanner s= new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if (head ==null) {
				head= newnode;
				tail=newnode;
			}else {
				tail.next= newnode;
				tail= newnode;
			}
			data = s.nextInt();
			
		}
		return head;
	}
	
	public static void print(node<Integer> head) {
		 node<Integer> temp= head;
		 while (temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
			 return;
		 }
		 System.out.println();
	}


	public static node<Integer> midpoint(node<Integer> head) {
		if (head==null && head.next== null) {
			return head;
		}
		node<Integer> slow=head, fast=head;
		// took slow and fast start with same head.
		while (fast.next !=null && fast.next.next != null) { // fast is 2x of the speed to the slow
			slow= slow.next; // slow move to next
			fast= fast.next.next; // fast is move to next of the next
					
		}
		return slow; //after that where slow , its a mid point.
	}
	
	public static void main(String[] args) {
		node<Integer> head= takeinput();

		System.out.println("MidPoint of The Linked List");
		node<Integer> midp= midpoint(head);
		print(midp);

	}

}
