package BST_II;

import java.util.ArrayList;
import java.util.Scanner;

import BST_I.BinaryTreeNode;
import BST_I.QueueUsingLL;

public class root_to_Node_path {
	
	public static ArrayList<Integer> rootpath(BinaryTreeNode<Integer> root, int data){
		if (root== null) {
			return null;
		}
		if (root.data == data) {
			ArrayList<Integer> output= new ArrayList<>();
			output.add(root.data);
			return output;
		}
		ArrayList<Integer> leftoutput= rootpath(root.left, data);
		if (leftoutput !=null) {
			leftoutput.add(root.data);
			return leftoutput;
		}
		ArrayList<Integer> rightOutput= rootpath(root.right, data);
		if (rightOutput !=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		else {
			return null;
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
	
		System.out.print(rootpath(root, 7));
	
	

	}

}
