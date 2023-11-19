package IsBST_Better;

import BST_I.BinaryTreeNode;

public class isBST {
	
	public static Pair<Boolean,Pair<Integer,Integer>> isBST(BinaryTreeNode<Integer> root){
		if (root==null) {
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
			output.first=true;
			output.second= new Pair<>();
			// first is minimum & second is maximum
			output.second.first= Integer.MAX_VALUE;
			output.second.second= Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean, Pair<Integer, Integer>> leftoutput= isBST(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightoutput= isBST(root.right);
		int min= Math.min(root.data, Math.min(leftoutput.second.first, rightoutput.second.first));
		int max= Math.max(root.data, Math.max(leftoutput.second.second, rightoutput.second.second));
		boolean isBst=(root.data > leftoutput.second.second) &&(root.data < rightoutput.second.first) &&(leftoutput.first) && (rightoutput.first);
		
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
		output.first=isBst;
		output.second= new Pair<>();
		// first is minimum & second is maximum
		output.second.first=min;
		output.second.second= max;
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
