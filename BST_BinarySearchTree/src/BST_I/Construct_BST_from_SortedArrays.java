package BST_I;

public class Construct_BST_from_SortedArrays {
	
	public static BinaryTreeNode<Integer> treefromArray(int arr[], int n){
		return helper(arr, 0, n-1);
	}
	public static BinaryTreeNode<Integer> helper(int arr[], int SI, int EI){
		if (SI > EI) {
			return null;
		}
		int mid= (SI+EI)/2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left= helper(arr, SI, mid-1);
		root.right = helper(arr, mid+1, EI);
		return root;
	}
	public static void print(BinaryTreeNode<Integer> root) {
		if (root==null) {
			return;
		}
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int n= arr.length;
		BinaryTreeNode<Integer> root= treefromArray(arr, n);
		print(root);
		
		
	}

}
