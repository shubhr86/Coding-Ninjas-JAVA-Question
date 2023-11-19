package Lecture_14_BinaryTree_2;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class sum_to_root_Path {
	
	public static void sumtopath(BinaryTreeNode<Integer> root , int k ) {
		sumtopath(root, k, "");
	}
	
	public static void sumtopath(BinaryTreeNode<Integer> root , int k, String s ) {
		if (root == null) {
			return;
		}
		if (root.left==null && root.right==null && root.data==k) {
		
			System.out.println(s+root.data+" ");
			return;
		}
		s= s+ root.data+" ";
		sumtopath(root.left, k-root.data, s);
		sumtopath(root.right, k-root.data, s);
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
		sumtopath(root, 13);

	}

}
