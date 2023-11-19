package Lecture_14_BinaryTree_2;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class printNodesAtDistance {
	
	public static void nodesatdistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		int x= print(root, k, node);
	}
	
	public static int print (BinaryTreeNode<Integer> root, int k, int element) {
		if (root== null) {
			return -1;
		}
		// if element found at root.data
		if (root.data==element) {
			printKdepth(root, k);
			return 0;
		}
		int leftDistance= print(root.left, k, element);
		int rightDistance;
		if (leftDistance ==-1) {
			rightDistance= print(root.right, k, element);
			if (rightDistance == -1) {
				return -1;
			}else if (rightDistance + 1 ==k) {
				System.out.println(root.data+ " ");
				return k;
			}else {
				printKdepth(root.left, k-rightDistance-2);
				return rightDistance + 1;
			}
		}else if (leftDistance + 1 ==k) {
			System.out.println(root.data + " ");
			return k;
		}else {
			printKdepth(root.right, k-leftDistance - 2);
			return leftDistance + 1;
		}
		
	}
	
	public static void printKdepth(BinaryTreeNode<Integer> root, int depth) {
		if (root==null) {
			return;
		}
		if (depth ==0 && root!=null) {
			System.out.println(root.data+" ");
			return;
		}
		printKdepth(root.left, depth-1);
		printKdepth(root.right, depth-1);
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
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		nodesatdistanceK(root, 3, 1);

	}

}
