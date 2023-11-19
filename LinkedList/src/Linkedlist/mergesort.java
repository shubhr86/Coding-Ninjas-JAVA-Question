package Linkedlist;

import java.util.Scanner;

public class mergesort {
	
	public static node<Integer> takeinput() {
		node<Integer> head =null, tail=null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if (head == null) {
				head= newnode;
				tail = newnode;
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
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
		System.out.println();
	} 
	
	public static node<Integer> midpoint(node<Integer> head) {
		if (head == null && head.next == null) {
			return head;
		}
		node<Integer> slow = head , fast = head;
		 while (fast.next != null && fast.next.next != null) {
			 slow = slow.next;
			 fast= fast.next.next;
		 }
		 return slow;
	}
	
	
	public static node<Integer> mergetwosort(node<Integer> head1, node<Integer> head2) {
		
		if (head1==null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		node<Integer> t1= head1, t2= head2;
		node<Integer> head= null, tail = null;
		
		if (t1.data <= t2.data) {
			head= t1;
			tail= t1;
			t1= t1.next;
		}else {
			head= t2;
			tail= t2;
			t2= t2.next;
		}
		 
		while (t1 != null && t2 != null) {
			if (t1.data<=t2.data) {
				tail.next= t1;
				tail=t1;
				t1= t1.next;
			}else {
				tail.next= t2;
				tail= t2;
				t2= t2.next;
			}
		}
		if (t1 !=null) {
			
			tail.next= t1;
			
		}
		else {
			tail.next= t2;
		}
		return head;
	}
	
	
	public static node<Integer> MergeSort(node<Integer> head) {
		
		if (head == null || head.next == null) {
			return head;
		}
		node<Integer> midnode= midpoint(head), part1= head, part2=null;
		part2=midnode.next; // part2 node head start from midnode +1
		midnode.next=null;
		node<Integer> head1= MergeSort(part1);
		node<Integer> head2= MergeSort(part2);
		node<Integer> newhead= mergetwosort(head1, head2);
		return newhead;
		
	}
	
	public static void printRescrsive(node<Integer> head) {
		if (head == null) {
			return;
		}
		
		printRescrsive(head.next);
		System.out.print(head.data+" ");
		
	}
	public static void main(String[] args) {
		node<Integer> head= takeinput();
//		node<Integer> ans=MergeSort(head);
//		print(ans);
		printRescrsive(head);

	}

}
