package BinaryTree;

import java.util.Scanner;

public class minimumAndMax {
	
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

	   if(root==null){
           Pair<Integer,Integer> output=new Pair<>(Integer.MAX_VALUE,-1);
           return output;
       }
       Pair<Integer,Integer> leftPair=getMinAndMax(root.left);
       Pair<Integer,Integer> rightPair=getMinAndMax(root.right);
       int max=Math.max(root.data,Math.max(leftPair.maximum,rightPair.maximum));
       int min=Math.min(root.data,Math.min(leftPair.minimum,rightPair.minimum));
       Pair<Integer,Integer> output=new Pair<>(min,max);
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
		System.out.println(getMinAndMax(root).maximum);

	}

}
