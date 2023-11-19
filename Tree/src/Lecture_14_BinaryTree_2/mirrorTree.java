package Lecture_14_BinaryTree_2;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class mirrorTree {
	
	public static void printMirrorTree(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return;
		}
		
		BinaryTreeNode<Integer> temp=root.left;
				root.left= root.right;
				root.right=temp;
			
		if (root.left!=null) {
			printMirrorTree(root.left);
		}
		if (root.right!=null) {
			printMirrorTree(root.right);
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
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueueEmptyException{
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

		primary.enQueue(root);

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> current=null;
			current = primary.deQueue();
			System.out.print(current.data + " ");
			if(current.left != null){
				secondary.enQueue(current.left);
			}
			if(current.right != null){
				secondary.enQueue(current.right);
			}
			if(primary.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
				secondary = primary;
				primary = temp;
				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		printMirrorTree(root);
		printLevelWise(root);

	}

}
