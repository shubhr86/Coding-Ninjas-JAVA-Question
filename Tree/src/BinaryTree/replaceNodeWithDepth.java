package BinaryTree;

import java.util.Scanner;

public class replaceNodeWithDepth {
	
	public static void printDepthNode(BinaryTreeNode<Integer> root) {
		
		printhelper(root,0);
	}
	public static void printhelper(BinaryTreeNode<Integer> root, int depth) {
		
		root.data=depth;
		 printhelper(root.left, depth +1);
		
		printhelper(root.right, depth +1);
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
	
	public static void print(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		print(root);
		printDepthNode(root);
		

	}

}
