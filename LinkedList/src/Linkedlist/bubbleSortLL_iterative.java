package Linkedlist;

import java.util.Scanner;

public class bubbleSortLL_iterative {
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
    public static int length(node<Integer> head){

		int l=0;
		while(head!=null){
			l++;
			head=head.next;
		}
		return l;
	}
    public static node<Integer> bubbleSort(node<Integer> head){
    	node<Integer> originalHead= head;
    	int n = length(head);
    	for (int i=0;i <n-1 ; i++) {
    		node<Integer> previous= null, current = originalHead;
    		for (int j=0; j<n-i-1;j++) {
    			if (current.data <= current.next.data) {
    				previous= current;
    				current = current.next;
    			}
    			else {
    				if(previous == null) {
    					node<Integer> current2 = current.next;
    					node<Integer> temp= current2.next;
    					current2.next = current;
    					current.next= temp;
    					previous= current2;
    					originalHead= current2;
    					
    				}else {
    					node<Integer>current2= current.next;
    					node<Integer> temp= current2.next;
    					previous.next=current2;
    					current2.next=current;
    					current.next=temp;
    					previous= current2;
    				}
    			}
    		}
    	}
    	return originalHead;
    }

	public static void main(String[] args) {
		node<Integer> head= takeInput();
		node<Integer> bubble= bubbleSort(head);
		print(bubble);

	}

}
