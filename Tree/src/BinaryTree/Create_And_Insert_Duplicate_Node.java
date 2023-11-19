package BinaryTree;

import java.util.Scanner;

import Lecture_14_BinaryTree_2.QueueEmptyException;

public class Create_And_Insert_Duplicate_Node {
	
	public static void insertduplicate(BinaryTreeNode<Integer> root) {
		
		if (root==null) {
			return;
		}
		insertduplicate(root.left);
		insertduplicate(root.right);
		BinaryTreeNode<Integer> duplicate= new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> temp= root.left;
		
		
		root.left= duplicate;
		duplicate.left= temp;
		
		
		
		
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
	
	private static void printLevelWise(BinaryTreeNode<Integer> root){
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

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		insertduplicate(root);
		printLevelWise(root);
	}

}
