package Linkedlist;

import java.util.Scanner;

public class insertNUmberbetween {
	
	public static node<Integer> takeinput() {
		node<Integer> head=null, tail=null;
		Scanner s = new Scanner (System.in);
		int data= s.nextInt();
		
		while (data!= -1) {
			node<Integer> newnode= new node<Integer> (data);
			if (head==null) {
				head=newnode;
				tail=newnode;
						
			}else {
				tail.next=newnode;
				tail= newnode;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void insertnum(node<Integer> head, int data, int pos) {
		node<Integer> newnode= new node<Integer>(data);
	
		if (pos==0) {  // taking care of in case position 1
			
					
			newnode.next=head;
			head= newnode;
			System.out.print(head.data+" ");
			return;
					
			
		}
		
		int i=0;
		node<Integer> temp=head;
		while (i< pos-1) {
			temp= temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	
	public static void print(node<Integer> head) {
		node<Integer> temp=head; 
		
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		node<Integer> head= takeinput();
		insertnum(head, 50, 0);
		print(head);
	}

}
