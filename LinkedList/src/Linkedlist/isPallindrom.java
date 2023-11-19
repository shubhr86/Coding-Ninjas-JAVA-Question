package Linkedlist;

import java.util.Scanner;

public class isPallindrom {
	
	public static node<Integer> takeinput() {
		node<Integer> head= null, tail=null;
		Scanner s = new Scanner(System.in);
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
			data =s.nextInt();
			
		}
		return head;
	}
	
	public static void print(node<Integer> head) {
		node<Integer> temp= head;
		while (temp!=null) {
			System.out.print(temp.data+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	
	public static node<Integer> reverse(node<Integer> head) {
		if (head.next== null) {
			return head;
		}
		node<Integer> tail= head.next;
		node<Integer> newhead= reverse(head.next);
		tail.next=head;
		head.next=null;
		return newhead;
	}
	
	public static boolean isPalindrome(node<Integer> head) {
		node<Integer> slow= head, fast= head;
		while (fast.next!=null && fast.next.next !=null) {
			slow= slow.next;
			fast= fast.next.next;
		}
		node<Integer> head1= slow.next;
		node<Integer> head2= head;
		head1=reverse(head1);
		while (head1!=null && head2!=null) {
			if (!head1.data.equals(head2.data)) {
				return false;
			}
			head1=head1.next;
			head2=head2.next;
		}
		return true;
	}

		

	public static void main(String[] args) {
		node<Integer> head= takeinput();
		System.out.println(isPalindrome(head));

	}

}
