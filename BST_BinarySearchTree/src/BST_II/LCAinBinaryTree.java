package BST_II;

import java.util.Scanner;

import BST_I.BinaryTreeNode;

public class LCAinBinaryTree {
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a , int b) {
		if (root == null) {
			return -1;
		}
		if (root.data == a || root.data == b) {
			return root.data;
		}
		int leftLCA= getLCA(root.left, a, b);
		int rightLCA= getLCA(root.right, a, b);
		
		if (leftLCA == -1 && rightLCA == -1) {
			return -1;
		}
		
		else if (leftLCA == -1) {
			return rightLCA;
		}
		else if (rightLCA == -1) {
			return leftLCA;
		}else {
			return root.data;
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
		int h = getLCA(root, 2, 10);
		System.out.println(h);

	}

}
