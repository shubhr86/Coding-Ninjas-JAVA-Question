package BST_II;

import BST_I.BinaryTreeNode;

public class binarySearchTree {
	
	private BinaryTreeNode<Integer> root;
	
	private BinaryTreeNode<Integer> insertDatahelper(int data, BinaryTreeNode<Integer> root) {
		if (root==null) {
			BinaryTreeNode<Integer> newnode= new BinaryTreeNode<Integer>(data);
			return newnode;
		}
		if (data  < root.data) {
			// call left
			
		root.left = insertDatahelper(data, root.left);
	
		}else {
			root.right= insertDatahelper(data, root.right);
			
		}
		return root;
		
	}
	
	public  void insertData(int data) {
		
	root= insertDatahelper(data, root);
	
	}
	
	private BinaryTreeNode<Integer> deletedatahelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (data < root.data) {
			root.left= deletedatahelper(data, root.left);
			return root;
		}else if (data > root.data) {
			root.right= deletedatahelper(data, root.right);
			return root;
		}
		else {
			// both right and left null | means there is only root avilable
			if (root .left== null && root.right == null) {
				return null;
			}else 
				// if only left null the we need to make newroot which is from right
				if (root.left== null) {
				return root.right;
			}else 
				// if only right null the we need to make newroot which is from left
				if ( root.right == null) {
				return root.left;
			}else {
				// if both left and right avilable, then which will become new root
				BinaryTreeNode<Integer> minNode= root.right;
				while (minNode.left != null) {
					minNode= minNode.left;
				}
				root.data= minNode.data;
				root.right= deletedatahelper(minNode.data, root.right);
				return root;
			}
		}
	}
	
	public  void deletedata(int data) {
		deletedatahelper(data, root);
	}
	
	private  boolean hasDatahelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}
		if (data > root.data) {
			// call Right
			return hasDatahelper(data, root.right);
		}
		else {
			// call left
			return hasDatahelper(data, root.left);
		}
	}
	
	public  boolean hasData(int data) {
		return hasDatahelper(data, root);
	}
	
	public void print() {
		print(root);
	}

	private void print(BinaryTreeNode<Integer> root) {
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

}
