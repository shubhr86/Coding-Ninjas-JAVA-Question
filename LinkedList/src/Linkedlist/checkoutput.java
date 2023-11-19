package Linkedlist;

import java.util.Scanner;

public class checkoutput {
	
	public static node<Integer> takeinput() {
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
			data=s.nextInt();
		}
		return head;
		
	}
	public static void fun(node start)
	{
	  if(start == null)
	    return;
	
	    fun(start.next);
	  System.out.print(start.data+" ");
	}
	

	public static void main(String[] args) {
		node<Integer> head= takeinput();
		fun(head);
		

	}

}
