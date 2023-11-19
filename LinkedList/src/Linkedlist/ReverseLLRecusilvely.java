package Linkedlist;

import java.util.Scanner;

public class ReverseLLRecusilvely {
	
	public static node<Integer> takeInput(){
		node<Integer> head = null, tail= null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode= new node<Integer>(data);
			if (head==null) {
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
	
	public static void printR(node<Integer> head) {
		if (head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printR(head.next);
	}
	
	public static node<Integer> ReverseLL(node<Integer> head) {
		if (head == null || head.next ==null) {
			return head;
		}
		// collecting the head.next to the final head
		node<Integer> finalhead= ReverseLL(head.next); 
		// our work starts now to put last node to the last of the LL
		// travel to the last of LL
		node<Integer> temp= finalhead;
		while (temp.next !=null) {
			temp= temp.next;
			
		}
		temp.next= head;
		// this statment for the last node because it's need to point the null
		head.next=null;
		return finalhead;
	}

	public static void main(String[] args) {
		node<Integer> head= takeInput();
		node<Integer> reverse= ReverseLL(head);
		printR(reverse);
		
		// time complexity is O(n^2)

	}

}
