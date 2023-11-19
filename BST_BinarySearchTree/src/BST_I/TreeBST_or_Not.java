package BST_I;

import java.util.Scanner;

public class TreeBST_or_Not {
	
	public static boolean checkBSTorNot(BinaryTreeNode<Integer> root) {
		if (root== null) {
			return true;
		}
		int leftmax= maximum(root.left);
		int rightmin= minimum(root.right);
		
		if (root.data <= leftmax) {
			return false;
		}
		if (root.data > rightmin) {
			return false;
		}
		boolean isLeft= checkBSTorNot(root.left);
		boolean isRight= checkBSTorNot(root.right);
		if (isLeft && isRight) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root== null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root== null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
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
		System.out.println(checkBSTorNot(root));

	}

}
