package IsBalanceBetter;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

// Time complexity O(n)

public class isBalancedBetter {
	
	public static BalancedTree isbal(BinaryTreeNode<Integer> root) {
		// Base Case
		// Created Object so we get height and isBalance in one way time.
		if (root==null){
		int height=0;
		boolean isbal=true;
		BalancedTree ans= new BalancedTree();
		ans.height= height;
		ans.isBalanced= isbal;
		return ans;
		}
		BalancedTree leftoutput= isbal(root.left);
		BalancedTree rightoutput= isbal(root.right);
		boolean isbal= true;
		int height= 1+ Math.max(leftoutput.height, rightoutput.height);
		
		// if height Difference above the 1
		
		if (Math.abs(leftoutput.height - rightoutput.height) >1) {
			isbal= false;
		}
		// check the balanced or not
		if (!leftoutput.isBalanced || !rightoutput.isBalanced) {
			isbal = false;
		}
		BalancedTree ans = new BalancedTree();
		ans.height= height;
		ans.isBalanced= isbal;
		return ans;
		
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
		System.out.println(isbal(root).isBalanced);

	}

}
