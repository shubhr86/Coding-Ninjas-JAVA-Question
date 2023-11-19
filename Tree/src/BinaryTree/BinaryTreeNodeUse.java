package BinaryTree;

import java.util.Scanner;

public class BinaryTreeNodeUse {
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s ){
		int rootData;
		System.out.println(" Root Data ");
		rootData=s.nextInt();
		// when user want to not give any children/ node of the Tree
		if (rootData== -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		System.out.print("Enter Left ");
		root.left= takeInput(s);
		System.out.print("Enter Right ");
		root.right=takeInput(s);
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return;
		}
		String toprint=root.data+" ";
		if (root.left!=null) {
			toprint+= "L"+ root.left.data+", ";
		}
		if (root.right!=null) {
			toprint+="R" + root.right.data+", ";
		}
		System.out.println(toprint);
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root= takeInput(s);
		print(root);

	}

}
