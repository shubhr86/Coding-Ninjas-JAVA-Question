package BinaryTree;

import java.util.Scanner;

public class countNumberGreaterThanX {
	
	public static int countGreateraThanX(BinaryTreeNode<Integer> root, int x) {
		
		if(root==null) {
			return 0;
		}
		
		int ans= countGreateraThanX(root.left, x)+  countGreateraThanX(root.right, x);
		if (root.data> x) {
			return ans+1;
			
		}else {
			return ans;
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
		BinaryTreeNode<Integer> input= takeinputLevelWise();
		int count =(countGreateraThanX(input, 5));
		System.out.println(count);

	}

}
