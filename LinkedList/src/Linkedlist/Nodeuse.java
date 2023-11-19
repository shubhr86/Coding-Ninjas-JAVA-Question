package Linkedlist;

public class Nodeuse {
	
	public static void print(node<Integer> head) { // this is how we make function for nodes
		
	while (head!=null) {
			
			System.out.print(head.data+" ");
			head=head.next;  // head.next address of the next element
		}
	}

	public static void main(String[] args) {

		node <Integer> node= new node <Integer>(15);
		node<Integer> node1= new node <Integer>(20);
		node<Integer> node2= new node <Integer>(30);
		node<Integer> node3= new node <Integer>(25);
//		System.out.println(node.data);
//		System.out.println(node.next);
//		
		
		// Make Links between node and node 1
		// giving node to next node reference
		
		node.next=node1;
		node1.next=node2;
		node2.next=node3;
		
		//System.out.println(node.next);
		//System.out.println(node1);
		
		
		// how to print all Linked List | or linking them
		node <Integer> head= node;
		
		print(head);
		
	
		
	}

}
