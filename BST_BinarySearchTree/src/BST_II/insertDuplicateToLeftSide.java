package BST_II;

import java.util.Scanner;

import BST_I.BinaryTreeNode;

public class insertDuplicateToLeftSide {
	
	public static void duplicate(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> duplicate=new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> rootLeft= root.left;
		duplicate(root.left);
		duplicate(root.right);
		root.left= duplicate;
		duplicate.left= rootLeft;
		
		
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
	
	private static void printLevelWise(BinaryTreeNode<Integer> root){
		QueueUsingLL<BinaryTreeNode<Integer>>  primary = new QueueUsingLL<>();
		QueueUsingLL<BinaryTreeNode<Integer>>  secondary = new QueueUsingLL<>();

		primary.enQueue(root);

		while(!primary.isEmpty()){
			BinaryTreeNode<Integer> current=null;
			current = primary.deQueue();
			System.out.print(current.data + " ");
			if(current.left != null){
				secondary.enQueue(current.left);
			}
			if(current.right != null){
				secondary.enQueue(current.right);
			}
			if(primary.isEmpty()){
				QueueUsingLL<BinaryTreeNode<Integer>>  temp = secondary;
				secondary = primary;
				primary = temp;
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		duplicate(root);
		printLevelWise(root);
	}

}
