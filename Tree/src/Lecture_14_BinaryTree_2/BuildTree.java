package Lecture_14_BinaryTree_2;



import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class BuildTree {
	public static  BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[] , int inorderstart, int inorderEnd, int preorderStart, int preorderEnd){
		if (inorderstart > inorderEnd) {
			return null;
		}
		int rootData= pre[preorderStart];
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		// Now search for root.data in InOrder
		int rootIndex=-1; 
		for(int i=inorderstart; i<=inorderEnd; i++) {
			if (in[i] == rootData) {
				rootIndex=i;
				break;
			}
		}
		// if any issue means root.data not found in InOrder that means its missing
		if (rootIndex== -1) {
			return null;
		}
		int leftInorderStart= inorderstart;
		int leftInorderEnd= rootIndex-1;
		int leftPreorderStar= preorderStart + 1;
		int leftPreorderEnd= leftInorderEnd -  leftInorderStart + leftPreorderStar;
		int rightInorderStart= rootIndex + 1;
		int rightInorderEnd= inorderEnd;
		int rightpreorderStart= leftPreorderEnd + 1;
		int rightpreOrderEnd= preorderEnd;
		root.left= buildTreeHelper(in, pre, leftInorderStart, leftInorderEnd, leftPreorderStar, leftPreorderEnd);
		 root.right = buildTreeHelper(in, pre, rightInorderStart, rightInorderEnd, rightpreorderStart, rightpreOrderEnd);
		
		return root;
	}
	
	
	public static BinaryTreeNode<Integer> buildTree( int in[], int pre[]){
		return buildTreeHelper(in, pre, 0, in.length-1, 0, pre.length-1);
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
		int in[]= {2,3,2,5,7};
		int pre[]= {5,3,1,2,7,};
		BinaryTreeNode<Integer> root = buildTree(in, pre);
		printLevelWise(root);
		

	}

}
