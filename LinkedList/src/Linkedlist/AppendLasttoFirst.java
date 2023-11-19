package Linkedlist;

import java.util.Scanner;

public class AppendLasttoFirst {
	
	public static node<Integer> takeInput() {
		node<Integer> head=null, tail=null;
		Scanner s = new Scanner (System.in);
		int data =s.nextInt();
		while (data != -1) {
			node<Integer> newnode = new node<Integer>(data);
			if (head==null) {
				head=newnode;
				tail= newnode;
						
			}else {
				tail.next=newnode;
				tail=newnode;
				
			}
			data=s.nextInt();
		}
		return head;
	}

	
	public static node<Integer> appendLastNToFirst(node<Integer> head, int n) {
		node<Integer> node=head,checkNode=null,newHead=null;

		if (n==0)
        {
            return head;
        }
        
        int count=0;
        while(node!=null)
        {
            node=node.next;
            count=count+1;
        }
        if (count<n)
        {
            return head;
        }
        
        n=count-n;
        node=head;
        for (int i=0;i<n-1;i++)
        {
            node=node.next;
        }
        checkNode=node.next;
        node.next=null;
        newHead=checkNode;
//        System.out.println("Shifting from element: "+checkNode.data);
//      System.out.println("Now last element is: "+node.data);
//      System.out.println("Now first element is: "+newHead.data);
        while(checkNode.next!=null)
        {
            checkNode=checkNode.next;
        }
        checkNode.next=head;
        head=newHead;
        return head;
        
	}


	public static void print(node<Integer> head) {
        node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	public static void main(String[] args) {
		
		node<Integer> head= takeInput();
		node<Integer> head2=appendLastNToFirst(head, 3);
		print(head2);
		
		
	

	}

}
