package BinaryTree;

import java.util.Scanner;

public class nodesWithoutSiblings {
	
	public static void nodesWithout(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return;
		}
		if (root.left==null && root.right==null) {
			return;
		}
		if (root.left==null) {
			System.out.print(root.right.data+" ");
			nodesWithout(root.right);
		}
		else if (root.right ==null) {
			System.out.print(root.left.data+" ");
			nodesWithout(root.left);
		}
		else {
			nodesWithout(root.left);
			nodesWithout(root.right);
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
		BinaryTreeNode<Integer> input = takeinputLevelWise();
		nodesWithout(input);

	}

}
