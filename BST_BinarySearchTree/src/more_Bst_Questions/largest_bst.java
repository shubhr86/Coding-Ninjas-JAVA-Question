package more_Bst_Questions;


import java.util.Scanner;

import BST_I.BinaryTreeNode;
import BST_I.QueueUsingLL;

public class largest_bst {
	
	public static Pair largestHelper(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair output = new Pair();
			output.max= Integer.MIN_VALUE;
			output.min= Integer.MAX_VALUE;
			output.isBst= true;
			output.height=0;
			return output;
		}
		Pair left= largestHelper(root.left);
		Pair right= largestHelper(root.right);
		
		Pair output = new Pair();
		// calculate Min value
		int min= Math.min(root.data, Math.min(left.min, right.min));
		
		// Calculate max
		
		int max= Math.max(root.data, Math.max(left.max, right.max));
		
		output.min = min;
		output.max = max;
		// check the Tree is BST or not
		output.isBst= left.max < root.data && right.min > root.data && left.isBst && right.isBst;
		if (output.isBst) {
			// get the Tree height in case of bst is true
			output.height = Math.max(left.height, right.height) + 1;
		}else {
			// get the Tree height in case of bst is false
			
			output.height = Math.max(left.height, right.height);
		}
		return output;
	}
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		Pair ans= largestHelper(root);
		return ans.height;
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
	 int height= largestBSTSubtree(root);
	 System.out.println(height);

	}

}
class Pair{
	int min;
	int max;
	boolean isBst;
	int height;
}
