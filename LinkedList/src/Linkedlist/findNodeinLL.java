package Linkedlist;

import java.util.Scanner;

public class findNodeinLL {
	
	public static node<Integer> takeInput() {
		node<Integer> head = null, tail= null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode= new node<Integer>(data);
			if ( head == null) {
				head= newnode;
				tail= newnode;
		
			}else {
				tail.next= newnode;
				tail = newnode;
						
						
			}
			data= s.nextInt();
		}
		return head;
	}

	public static void print(node<Integer> head) {
		if (head==null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}
	
	public static int findNodeRec(node<Integer> head, int n) {
		
		if (head == null) {
			return -1;
		}
		int ans;
		if (head.data.equals(n)) {
			return 0;
		}
		ans= findNodeRec(head.next, n);
		if (ans== -1) {
			return ans;
		}else {
			return ans+1;
		}
	}
	
	public static void main(String[] args) {
		node<Integer> head= takeInput();
		int nodeindex=findNodeRec(head, 3);
		System.out.println(nodeindex);
	
	}

}
