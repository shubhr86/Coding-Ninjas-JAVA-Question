package Linkedlist;

import java.util.Scanner;

public class mergetwoSortedLL {
	
	public static node<Integer> takeinput(){
		node<Integer> head1=null, tail1=null, head2= null, tail2=null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if (head1==null) {
				head1= newnode;
				tail1= newnode;
						
			}else {
				tail1.next= newnode;
				tail1= newnode;
						
			}
			data=s.nextInt();
			
		}
		return head1;
	}
	public static node<Integer> takeInput(){
		node<Integer> head2= null, tail2=null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		while (data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if (head2==null) {
				head2= newnode;
				tail2= newnode;
						
			}else {
				tail2.next= newnode;
				tail2= newnode;
						
			}
			data=s.nextInt();
			
		}
		return head2;
	}
	public static node<Integer> merge(node<Integer> head1, node<Integer> head2) {
	   // first checking the case like Any list is empty or not
		if (head1 ==null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		
		
		node<Integer> t1= head1, t2= head2;
		// take head reference not a new node of the head
		node<Integer> head=null, tail =null;
		
		
		
		// decide 1st node of the list
		
		if (t1.data<= t2.data) {
			head=t1;
			tail = t1;
			t1=t1.next;
		}else {
			head=t2;
			tail= t2;
			t2= t2.next;
			
		}
		while (t1 !=null && t2 !=null) {
			if (t1.data<= t2.data) {
				tail.next= t1;
				tail= t1;
				t1= t1.next;
			}else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		// One list is Over
		if (t1 !=null) {
			
			// first list is remaining
			
			tail.next=t1;
		}else {
			// 2nd list remaining
			tail.next=t2;
		}
		return head;
	}

	public static void print(node<Integer> head) {
		node<Integer> temp= head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		node<Integer> head1= takeinput();
		node<Integer> head2 = takeInput();
		node<Integer> merge= merge(head1, head2);
		print(merge);

	}

}
