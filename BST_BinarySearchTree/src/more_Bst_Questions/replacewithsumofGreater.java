package more_Bst_Questions;

import java.util.Scanner;

import BST_I.BinaryTreeNode;
import BST_I.QueryEmptyException;
import BST_I.QueueUsingLL;

public class replacewithsumofGreater {
	
	public static void replace(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		int ans = replaceHelper(root, 0);
	}
	
	public static int replaceHelper(BinaryTreeNode<Integer> root, int sum) {
		if (root == null) {
			return 0;
		}
		
		/*
		 first right side
		   then Root
		 Left side
		 */ 
		 int right = replaceHelper(root.right, sum);
		 int rootData= root.data;
				 root.data += right + sum;
				  int left = replaceHelper(root.left, root.data);
				  return rootData + right +left;
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
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) throws QueryEmptyException {
		if (root==null) {
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNode= new QueueUsingLL<>();
	
		pendingNode.enQueue(root);
		pendingNode.enQueue(null);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> first = pendingNode.front();
			pendingNode.deQueue();
			if (first == null) {
				if (pendingNode.isEmpty()) {
					break;
				}
				System.out.println();
				pendingNode.enQueue(null);
				continue;
			}
			System.out.print(first.data + " ");
			if (first.left != null) {
				pendingNode.enQueue(first.left);
			}
			if (first.right != null) {
				pendingNode.enQueue(first.right);
			
		
			}
		}
	}


	public static void main(String[] args) throws QueryEmptyException {
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		replace(root);
		printLevelWise(root);
				

	}

}
