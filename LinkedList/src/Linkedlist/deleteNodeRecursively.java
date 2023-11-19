package Linkedlist;

import java.util.Scanner;

public class deleteNodeRecursively {
	
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

	public static node<Integer> deleteNode(node<Integer>head , int pos){
		
		if (head == null) {
			return head;
		}
		
		
		if (pos == 0) {
			return head.next;
		}else {
			
		
		
		
		head.next= deleteNode(head.next, pos-1);
		return head;
		}
	}
	public static void main(String[] args) {
		node<Integer> head= takeInput();
		deleteNode(head, 0);
		printR(head);

	}

}
