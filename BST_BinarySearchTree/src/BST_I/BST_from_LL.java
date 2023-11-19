package BST_I;

import java.util.Scanner;
import java.util.*;

class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

	public class BST_from_LL{


	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Pair<LinkedListNode<Integer>,LinkedListNode<Integer>> output =helper(root);
		return output.first;
	}
	public static Pair<LinkedListNode<Integer>,LinkedListNode<Integer>> helper (BinaryTreeNode<Integer> root) {
		if (root== null) {
	        Pair<LinkedListNode<Integer>,LinkedListNode<Integer>> output=new Pair<>();
			output.first=null;
			output.second= null;
			return output;
		}
		Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> leftoutput= helper(root.left);
		LinkedListNode<Integer> newnode= new LinkedListNode<>(root.data);
		Pair<LinkedListNode<Integer>, LinkedListNode<Integer>> rightoutput= helper(root.right);
		Pair<LinkedListNode<Integer>,LinkedListNode<Integer>> output = new Pair<>();
		if (leftoutput.first!=null) {
			output.first= leftoutput.first;
			leftoutput.second.next= newnode;
		}else {
			output.first= newnode;
		}
		newnode.next= rightoutput.first;
		if (rightoutput.first==null) {
			output.second=newnode;
			
		}else {
			output.second= rightoutput.second;
		}
		return output;


	}
	
	public static BinaryTreeNode<Integer> takeinputLevelWise(){
		Scanner s = new Scanner (System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNode= new QueueUsingLL<>();
		System.out.println("Enter Root Data");
		int rootData= s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		pendingNode.enQueue(root);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> front;
			front=pendingNode.deQueue();
			System.out.println("Enter Left Child of "+ front.data);
			int leftchild= s.nextInt();
			if (leftchild!= -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftchild);
				pendingNode.enQueue(child);
				front.left= child;
			}
			System.out.println("Enter Right Child of "+ front.data);
			int rightchild= s.nextInt();
			if (rightchild!= -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightchild);
				pendingNode.enQueue(child);
				front.right= child;
			}
		}
		return root;
		
	}


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		LinkedListNode<Integer> head= constructLinkedList(root);
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
				

	}

	
}
