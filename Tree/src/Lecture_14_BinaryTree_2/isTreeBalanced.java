package Lecture_14_BinaryTree_2;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;

public class isTreeBalanced {
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return 0;
		}
		int leftheight= height(root.left);
		int rightheight= height(root.right);
		return 1+ Math.max(leftheight, rightheight);
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root ) {
		if (root ==null) {
			return true;
		}
		int leftheight= height(root.left);
		int rightheight= height(root.right);
		if (Math.abs(leftheight- rightheight) > 1) {
			return false;
		}
		boolean isleftbalance= isBalanced(root.left);
		boolean isrightbalance= isBalanced(root.right);
		return isleftbalance && isrightbalance;
		
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
		System.out.println("Is Balanced: "+ isBalanced(root));

	}

}
