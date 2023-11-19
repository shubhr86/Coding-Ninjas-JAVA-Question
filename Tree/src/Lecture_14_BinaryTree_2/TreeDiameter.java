package Lecture_14_BinaryTree_2;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class TreeDiameter {
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return 0;
		}
		// adding 1 in option 1 for a question where, height calculation is distance from 2 farthest Nodes
		int option1= 1+ height(root.left)+ height(root.right);
		int option2= diameter(root.left);
		int option3= diameter(root.right);
		return Math.max(option1, Math.max(option2, option3));
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root==null) {
		return 0;
		}
		int leftheight= height(root.left);
		int rightheight= height(root.right);
		return 1+ Math.max(leftheight, rightheight);
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
		System.out.println(diameter(root));

	}

}
