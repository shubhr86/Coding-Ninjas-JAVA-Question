package Linkedlist;

import java.util.Scanner;

public class kReverse {
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
    
    public static node<Integer> reverse(node<Integer> head) {
		node<Integer> previous= null, current= head;
		while(current != null) {
			node<Integer> temp= current.next;
			current.next= previous;
			previous= current;
			current= temp;
					
		}
		return previous;
				
	}
    
    public static int len (node<Integer> head) {
		int l=0;
		while (head != null) {
			l++;
			head= head.next;
		}
		return l;
	}
    
    public static node<Integer> kReverse(node<Integer> head, int k) {
		if (k >= len(head)) {
			return reverse(head);
		}
		node<Integer> temphead= head;
		for (int i=1; i< k; i++) {
			head= head.next;
		}
		node<Integer> temp= head.next;
		head.next= null;
		node<Integer> reversedHead= reverse(temphead);
		node<Integer> tail= temphead;
		node<Integer> smallans= kReverse(temp, k);
		tail.next= smallans;
		return reversedHead;
	}

	public static void main(String[] args) {
		node<Integer> head= takeInput();
		node<Integer> re= kReverse(head, 3);
		print(re);

	}

}
