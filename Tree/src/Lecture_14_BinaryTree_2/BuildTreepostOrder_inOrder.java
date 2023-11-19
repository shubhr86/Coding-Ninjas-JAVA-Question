package Lecture_14_BinaryTree_2;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class BuildTreepostOrder_inOrder {
	
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int post[], int in[], int postorderstart, int postorderend, int inorderstart, int inorderend){
		if (inorderstart >  inorderend || postorderstart > postorderend) {
			return null;
		}
		int rootData= post[postorderend];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootIndex=-1;
		for (int i=inorderstart; i<= inorderend; i++) {
			if (in[i]==rootData) {
				rootIndex=i;
				break;
			}
		}
		if (rootData == -1) {
			return null;
		}
		int leftInstart=inorderstart;
		int leftInend= rootIndex -1;
		int leftpostStart= postorderstart;
		int leftpostend= leftInend - leftInstart + leftpostStart;
		int rightinStart= rootIndex + 1;
		int rightinEnd= inorderend;
		int rightPostStart= leftpostend + 1;
		int rightPostEnd = postorderend - 1;
		root.left = buildTreeHelper(post, in, leftpostStart, leftpostend, leftInstart, leftInend);
		root.right=  buildTreeHelper(post, in, rightPostStart, rightPostEnd, rightinStart, rightinEnd);
		return root;
	}
	
	public static BinaryTreeNode<Integer> build (int post[], int in[]){
		return buildTreeHelper(post, in, 0, post.length-1, 0, in.length-1);
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
		int post[]= {4 ,5 ,2, 6 ,7, 3 ,1 };
		int in[] ={4 ,2 ,5, 1, 6, 3, 7 };
		BinaryTreeNode<Integer> root = build(post, in);
		printLevelWise(root);

	}

}
