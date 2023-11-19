package BinaryTree;

import java.util.Scanner;

public class printKdepth {
	
	/* Time Complexity
	 * for Addtion of Ans and base Case = O(1)
	 * 
	 * REST we only visit the Node for the 1 time. that means
	 * n nodes = N times. 
	 *    O(n) 
	 * 
	 */
	
	
	// means print th kth number of node in tree
	
	public static void printKdepthNodes(BinaryTreeNode<Integer> root, int k) {
		if (root== null) {
			return;
		}
		if (k==0) {
			System.out.print(root.data+" ");
			return;
		}
		 printKdepthNodes(root.left, k-1) ;
		 printKdepthNodes(root.right, k-1);
		 
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
		printKdepthNodes(input, 2);

	}

}
