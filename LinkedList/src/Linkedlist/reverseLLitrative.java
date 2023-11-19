package Linkedlist;

import java.util.Scanner;

public class reverseLLitrative {
	
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

	public static node<Integer> reverse(node<Integer> head) {
	
		node<Integer> current= head;
		node<Integer> previous= null;
		node<Integer> temp;
		
		
		
		while (current != null) {
			temp= current.next;
			current.next= previous;
			previous= current;
			current= temp;
		}
		return previous;
		
}
	
	public static void main(String[] args) {

		node<Integer> head= takeinput();
		head= reverse(head);
		PrintRec(head);

	}

}
