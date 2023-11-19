package Linkedlist;

import java.util.Scanner;

public class linklistTakeInput {
	
	public static node<Integer> takeinput(){
		node <Integer> head=null, tail=null; // for now no head yet, it will change after the 1st input
		Scanner s= new Scanner (System.in);
		int data = s.nextInt();
		
		// when we want to return from the loop and return
		while (data!= -1) { 
			node <Integer> newnode= new node<Integer>(data); // make node corresponding to the number
			if (head == null) { // for first node
				head= newnode;
				tail= newnode;
			} else { // if it's not a first node.. need to put it at last
//				node<Integer> temp= head;
//				while (temp.next !=null) { // for step to move forward 
//					temp= temp.next;
//				}
//				temp.next=newnode;
				
				tail.next= newnode;  // just put new node at the last position
				tail= newnode; // give the tail value of newnode
						
				
				
				
				
			}
			data= s.nextInt();
		}
		return head;
				
	}
	
	public static void print(node<Integer> head) {
		while (head != null) {
			System.out.print(head.data +" ");
			head= head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		node<Integer> head = takeinput();
		print(head);

	}

}
