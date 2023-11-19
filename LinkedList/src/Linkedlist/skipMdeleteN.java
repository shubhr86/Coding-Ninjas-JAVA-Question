package Linkedlist;

import java.util.Scanner;

public class skipMdeleteN {
	
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
    
    public static node<Integer> delete(node<Integer> head, int m, int n) {
		if (m==0) {
			return null;
		}
		if (n ==0) {
			return head;
		}
		node<Integer> originalhead= head;
		// two variables for Loops
		node<Integer> temp1= head, temp2= head; 
		while (head !=null) {
			temp1=head;
			// 1st loop till m & checking condtion is temp1 null or not?
			// i act as count
			// to reach the element after then delete the nodes
			for (int i=1; i<m && temp1 != null; i++) {
				temp1= temp1.next;
			}
			if (temp1 !=null) {
				temp2= temp1.next;
			}
			// 2nd loop for the n | how many elements need to delete from the LL
			for (int i=1; i<n && temp2 !=null; i++) {
				temp2= temp2.next;
			}
			if (temp2 !=null) {
				temp2=temp2.next;
			}
			if (temp1 !=null) 
				temp1.next=temp2;
				head=temp2;
			
			
		}
		return originalhead;
	}

	public static void main(String[] args) {
		node<Integer> head = takeInput();
		node<Integer> skip= delete(head, 2, 2);
		print(skip);

	}

}
