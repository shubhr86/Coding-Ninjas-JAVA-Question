package more_Bst_Questions;

import java.util.Scanner;

import BST_I.BinaryTreeNode;
import BST_II.QueueUsingLL;

public class printAtDistanceK {
	
	  public static void nodesAtDistanceK(BinaryTreeNode<Integer> root,int node,int k) {
	        nodesAtDistanceKWithRootDistance(root, node, k);
	    }
	
	   public static int nodesAtDistanceKWithRootDistance(BinaryTreeNode<Integer> root,int node,int k) {
	        if(root==null)
	            return -1;

	        if(root.data == node) {

	            printNodesDown(root,k);
	            return 0;
	        }
	        int leftHeight = nodesAtDistanceKWithRootDistance(root.left, node, k);
	        if(leftHeight!=-1) {
	            if(leftHeight+1 == k) {
	                System.out.println(root.data);
	            }
	            else {
	                printNodesDown(root.right, k-leftHeight-2);
	                
	            }
	            return leftHeight+1;
	        }
	        int rightHeight = nodesAtDistanceKWithRootDistance(root.right, node, k);
	        if(rightHeight!=-1) {
	            if(rightHeight+1 == k) {
	                System.out.println(root.data);
	            }
	            else {
	                printNodesDown(root.left, k-rightHeight-2);
	            }
	            return rightHeight+1;
	        }
	        return -1;

	    }
	private static void printNodesDown(BinaryTreeNode<Integer> root, int k) {
		if (root ==null) {
			return;
		}
		if (k==0) {
			System.out.println(root.data);
			return;
		}
		printNodesDown(root.left, k-1);
		printNodesDown(root.right, k-1);
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
		nodesAtDistanceK(root, 3, 1);		

	}

}
