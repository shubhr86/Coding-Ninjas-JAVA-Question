package Linkedlist;

import java.util.Scanner;

public class evenAfterOdd {
	
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
	    
	    public static node<Integer> evenafterOdd (node<Integer> head){
	    	node<Integer> oddhead=null, oddtail=null, evenhead=null, eventail= null;
	    	while (head != null) {
	    		if (head.data%2==0) {
	    			// is evenHead null or not?
	    			// if yes then put the even element
	    			if (evenhead==null) { 
	    				evenhead=head;
	    				eventail= head;
	    			}else {
	    				// if not then update tail.next to the element
	    				// and update the eventail to the recent element
	    				eventail.next= head;
	    				eventail= head;
	    			}
	    			// same conditions for the Odd elements
	    		}else {
	    			if (oddhead == null) {
	    				oddhead= head;
	    				oddtail=head;
	    			}else {
	    				oddtail.next=head;
	    				oddtail= head;
	    			}
	    		}
	    		head= head.next;
	    	}
	    	if (oddhead == null) {
	    		return evenhead;
	    	}
	    	if (evenhead == null) {
	    		return oddhead;
	    	}
	    	// join the link between odd tail and even head
	    	oddtail.next=evenhead;
	    	// even tail should point to the null
	    	eventail.next= null;
	    	// LL head
	    	return oddhead;
	    	
	    }

	public static void main(String[] args) {
		node<Integer> head= takeInput();
		head=evenafterOdd(head);
		print(head);
				

	}

}
