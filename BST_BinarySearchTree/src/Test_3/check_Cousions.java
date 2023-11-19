package Test_3;

import java.util.Scanner;

import BST_I.BinaryTreeNode;
import BST_II.QueueUsingLL;

public class check_Cousions {
	
	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		int depth1= depth(root,p);
		int depth2= depth(root,q);
		if (depth1 == 0 || depth2 == 0) {
			return false;
		}
		if (depth1 ==  depth2) {
			return !siblings(root,p,q);
		}else {
			return false;
		}
		
	}
	private static boolean siblings(BinaryTreeNode<Integer> root , int p, int q) {
		if (root == null) {
			return false;
		}
		if (root.left !=null && root.right !=null) {
			if (root.right.data == p && root.left.data == q){
				return true;
			}
			else if (root.right.data == q && root.left.data ==p) {
				return true;
			}else {
				return siblings(root.left, p, q) || siblings(root.right, p, q);
			}
		}
		if (root.left !=null) {
			return siblings(root.left, p, q);
		}else {
			return siblings(root.right, p, q);
		}
	}
	
	private static int depth(BinaryTreeNode<Integer> root, int p) {
		if (root == null) {
			return 0;
		}
		if (root.data ==p) {
			return 1;
		}
		int left= depth(root.left, p);
		if (left !=0) {
			return left +1;
		}
		int right = depth(root.right, p);
		if (right !=0) {
			return right+ 1 ;
		}else {
			return 0;
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
		BinaryTreeNode<Integer> root = takeinputLevelWise();
		System.out.println(isCousin(root, 2, 4));
	}

}
