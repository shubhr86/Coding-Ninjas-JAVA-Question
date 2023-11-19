package Linkedlist;

import java.util.Scanner;

public class reverseLLBetterway {
	
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
	
	public static DoubleNode reverseBetterway(node<Integer> head) {
		if ( head == null || head.next ==null) {
			DoubleNode ans = new DoubleNode(); // for storing double nodes head or tail
			ans.head= head; // what will be the head
			ans.tail= head; // what will be the tail
			return ans;
		}
		DoubleNode smallAns= reverseBetterway(head.next);
		smallAns.tail.next= head;
		head.next=null;
		
		// what we need to return "Double Node"
		DoubleNode ans = new DoubleNode();
		ans.head= smallAns.head; // over all list's head will head
		ans.tail= head; // over all list's tail will the head.
		return ans;
	}
	
	public static void main(String[] args) {
		node<Integer> head = takeinput();
	
		DoubleNode ans= reverseBetterway(head);
		PrintRec(ans.head);
		
		

	}

}
