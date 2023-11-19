package Linkedlist;

import java.util.Scanner;

public class deletetheNum {
	
	public static node<Integer> takeinput(){
		node<Integer> head=null, tail=null;
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		
		while (data != -1) {
			node<Integer> newnode= new node<Integer>(data);
			if (head == null) {
				head= newnode;
				tail= newnode;
			}else {
				tail.next= newnode;
				tail= newnode;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print (node<Integer> head) {
		node<Integer> temp= head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static node<Integer> deleteNum(node<Integer> head, int pos) {
		
		
		if (pos ==0) {
			head= head.next;	
			return head;
		}
		
		int i=0;
		node<Integer> temp=head;
		while (temp !=null && i < pos-1) {
			temp=temp.next;
			i++;
		}
		if (temp==null)
			return head;
		if (temp.next !=null)
			temp.next=temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		node<Integer> head= takeinput();
		head= deleteNum(head, 4);
		print(head);

	}

}
