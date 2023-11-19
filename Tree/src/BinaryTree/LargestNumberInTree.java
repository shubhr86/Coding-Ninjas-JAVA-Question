package BinaryTree;

import java.util.Scanner;

public class LargestNumberInTree {
	
	public static int largestNum(BinaryTreeNode<Integer>root) {
		if (root ==null) {
			return -1;
		}
		int leftlargest= largestNum(root.left);
		int rightlargest= largestNum(root.right);
		int rootnode= root.data;
		
		// return Math.max(rootnode, Math.max(rightlargest, leftlargest));
		// we can use that also, so these if statements not comes
		
		if (rootnode > leftlargest && rootnode > rightlargest) {
			return rootnode;
		}
		if (leftlargest > rootnode && leftlargest > rightlargest) {
			return leftlargest;
		}else {
			return rightlargest;
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
		BinaryTreeNode<Integer> input= takeinputLevelWise();
		System.out.println(largestNum(input));

	}

}
