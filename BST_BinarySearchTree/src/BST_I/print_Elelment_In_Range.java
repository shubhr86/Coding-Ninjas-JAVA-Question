package BST_I;

import java.util.Scanner;

public class print_Elelment_In_Range {
	
	public static void printelelment(BinaryTreeNode<Integer> root, int k1, int k2) {
		if (root==null) {
			return;
		}
		// k1 = minimum & k2 = maximum
		if (root.data <k1) {
			printelelment(root.left, k1, k2);
			
		}
		if (root.data > k2) {
			printelelment(root.right, k1, k2);
		}
		if (root.data >= k1 && root.data <= k2) {
			printelelment(root.left, k1, k2);
			System.out.print(root.data+" ");
			printelelment(root.right, k1, k2);
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
		printelelment(root, 1, 3);
			

	}

}
