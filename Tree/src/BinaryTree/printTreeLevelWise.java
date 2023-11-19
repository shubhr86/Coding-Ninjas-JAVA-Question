package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


public class printTreeLevelWise {
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNode= new QueueUsingLL<>();
		pendingNode.enQueue(root);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> firstNode= null;
			firstNode=pendingNode.deQueue();
			System.out.print(firstNode.data+":");
			if (firstNode.left!=null) {
				pendingNode.enQueue(firstNode.left);
				System.out.print("L:"+firstNode.left.data+",");
				
			}else {
				System.out.print("L:-1,");
			}
			if (firstNode.right!=null) {
				pendingNode.enQueue(firstNode.right);
				System.out.print("R:"+firstNode.right.data);
			}else {
				System.out.print("R:-1");
			}
			System.out.println();
		}
		
		
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
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		printLevelWise(root);
		

	}

}
