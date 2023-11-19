package Linkedlist;

import java.util.Scanner;

public class swapNodes {
	
	public static node<Integer> takeInput() {
        node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            node<Integer> newNode = new node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
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
    
    public static node<Integer> swapNodes(node<Integer> head, int i, int j) {
    	// p= previous| c= current
    	node<Integer> p1= null, p2=null, c1= head, c2= head;
    	
    	if (c2== null || c2.next== null) {
    		return head;
    	}
    	// traversal to the i
    	for (int k=1; k<=i;k++) {
    		p1=c1;
    		c1=c1.next;
    	}
    	// traversal to the j
    	for (int k=1;k<=j;k++) {
    		p2=c2;
    		c2=c2.next;
    	}
    	// taking care of the null conditions
    	if (p1==null) {
    		head=c2;
    	}else {
    		p1.next=c2;
    	}
    	node<Integer> temp=c2.next;
    	if (p2 != c1)
    		c2.next=c1.next;
    	else 
    		c2.next=c1;
    	if (p2==null) {
    		head= c1;
    	}else {
    		p2.next=c1;
    	}
    	c1.next= temp;
    	return head;
    }

	public static void main(String[] args) {
	node<Integer> head= takeInput();
	node<Integer> swap= swapNodes(head, 1, 3);
	print(swap);

	}

}
