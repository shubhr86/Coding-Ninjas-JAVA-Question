package BinaryTree;

import java.util.Scanner;

public class numberOfLeaves {
	
	/* Time Complexity
	 * for Addtion of Ans and base Case = O(1)
	 * 
	 * REST we only visit the Node for the 1 time. that means
	 * n nodes = N times. 
	 *    O(n) 
	 * 
	 */
	
	public static int numberofLeves(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return 0;
		}
		if (root.left==null && root.right==null) {
			return 1;
		}
		int leftLeves= numberofLeves(root.left);
		int rightLeaves= numberofLeves(root.right);
		return leftLeves+rightLeaves;
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
		BinaryTreeNode<Integer> input = takeinputLevelWise();
		int numberofLevaes= numberofLeves(input);
		System.out.println(numberofLevaes);

	}

}
