package DiaMeterofTreeBetter;

import java.util.Scanner;

import BinaryTree.BinaryTreeNode;
import BinaryTree.QueueUsingLL;

public class diameterofTreeBetter {
	
	public static Pair<Integer, Integer> diameter(BinaryTreeNode<Integer> root){
		if (root==null) {
			Pair<Integer, Integer> output= new Pair<>();
			output.height=0;
			output.diameter=0;
			return output;
		}
		// left & right contains height and Diameter both
		Pair<Integer, Integer> leftoutput= diameter(root.left);
		Pair<Integer, Integer> rightoutput= diameter(root.right);
		int height= 1+ Math.max(leftoutput.height, rightoutput.height);
		int option1= leftoutput.height+ rightoutput.height;
		int option2= leftoutput.diameter;
		int option3= rightoutput.diameter;
		int diameter= Math.max(option1, Math.max(option2, option3));
		Pair<Integer, Integer> output= new Pair<>();
		output.height=height;
		output.diameter=diameter;
		return output;

		
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
		BinaryTreeNode<Integer> root= takeinputLevelWise();
		System.out.println(diameter(root).diameter);

	}

}
