package Linkedlist;

import java.util.Scanner;

public class revsersebetterway3 {
	
	public static node<Integer> takeinput(){
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
			data = s.nextInt();
		}
		return head;
	}

	
	public static void PrintRec(node<Integer> head) {

		if (head == null) {
			return;
		}
		System.out.print(head.data+" ");
		PrintRec(head.next);
	}
	
	public static node<Integer> reverseBetterway(node<Integer> head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		// took 1st element for further work, which at the end will at 2nd last
		
		node<Integer> tail= head.next;
		node<Integer> smallhead= reverseBetterway(head.next);
		tail.next= head;
		head.next=null;
		
		return smallhead;
	}

	public static void main(String[] args) {
		node<Integer> head= takeinput();
		head= reverseBetterway(head);
		PrintRec(head);

	}

}
