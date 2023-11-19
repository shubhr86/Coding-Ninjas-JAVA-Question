package Lecture_14_BinaryTree_2;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class BuildTreePre_Post {
	
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int pre[], int post[], int preStart, int preEnd, int postStart, int postEnd){
		
		if ( postStart < postEnd ) {
			
				return null;
			}
		int rootData= pre[preStart];
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		
		
		int leftPreStart= preStart + 1;
		int leftpreEnd= preEnd -1;
		int leftPostStart= postStart;
		int leftPostEnd= leftPreStart - leftpreEnd ;
		int rightpreStart= leftpreEnd + 1;
		int rightPreEnd= preEnd;
		int rightPostStart= leftPostEnd + 1;
		int rightPostEnd= postEnd -1;
		
		root.left=buildTreeHelper(pre, post, leftPreStart, leftpreEnd, leftPostStart, leftPostEnd);
		root.right= buildTreeHelper(pre, post, rightpreStart, rightPreEnd, rightPostStart, rightPostEnd);
		return root;
		
	}
		public static BinaryTreeNode<Integer> buildTree(int pre[], int post[]){
			return buildTreeHelper(pre, post, 0, pre.length-1, 0, post.length-1);
}
		
		public static void printLevelWise(BinaryTreeNode<Integer> root) {
			if (root==null) {
				return;
			}
			QueueUsingLL<BinaryTreeNode<Integer>> pendingNode= new QueueUsingLL<>();
			pendingNode.enQueue(root);
			while (!pendingNode.isEmpty()) {
				BinaryTreeNode<Integer> firstNode= null;
				firstNode=pendingNode.deQueue();
				System.out.print(firstNode.data+":");
				if (firstNode.left!=null) {
					pendingNode.enQueue(firstNode.left);
					System.out.print("L:"+firstNode.left.data+",");
					
				}
				if (firstNode.right!=null) {
					pendingNode.enQueue(firstNode.right);
					System.out.print("R:"+firstNode.right.data);
				}
				System.out.println();
			}
			
			
				}
		
	public static void main(String[] args) {
		int pre[]= {5,3,1,2,7};
		int post[]= {1,2,3,7,5};
		
		BinaryTreeNode<Integer> root= buildTree(pre, post);
		printLevelWise(root);

	}

}
