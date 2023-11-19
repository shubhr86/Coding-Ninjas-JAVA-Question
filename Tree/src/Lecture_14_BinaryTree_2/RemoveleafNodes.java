package Lecture_14_BinaryTree_2;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;



public class RemoveleafNodes {
	
	public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root) {
		if ( root == null) {
			return null;
		}
		 if (root.left ==null && root.right==null) {
			 return null;
		 }
		 root.left=(root.left);
		 root.right=(root.right);
		 return root;
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
		String toprint=root.data+" ";
		if (root.left!=null) {
			toprint+= "L"+ root.left.data+", ";
		}
		if (root.right!=null) {
			toprint+="R" + root.right.data+", ";
		}
		System.out.println(toprint);
		print(root.left);
		print(root.right);
	}
	


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		BinaryTreeNode<Integer> newroot= removeLeaf(root);
		print(newroot);

	}

}
