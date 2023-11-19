package BST_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import BST_I.BinaryTreeNode;

public class findPairSum {
	
	public static void pairSum(BinaryTreeNode<Integer> root , int sum) {
		ArrayList<Integer> list= new ArrayList<>();
		convert(root, list);
		if (list == null) {
			return;
		}
		// sorting the Array
		Collections.sort(list);
		// taking 2 varibales for ittrative procceeding i from start j from end
		int i =0;
		int j= list.size() -1;
		
		while (i < j) {
			if (list.get(i) + list.get(j) == sum) {
				if (list.get(i) < list.get(j)) {
					// if sum found then print the Pair
					System.out.println(list.get(i)+" "+list.get(j));
					
				}else {
					System.out.println(list.get(j) + " "+ list.get(i));
					
				}
				// i lower than it means we need to add bigger value the i so move i to futer
				i++; j--;
			}else if (list.get(i) + list.get(j) < sum){ 
				i++;
				
			}else {
				j--;
			}
		}
	}
	
	public static void convert(BinaryTreeNode<Integer> root, ArrayList<Integer> binaryTreeConverted) {
		if (root == null) {
			 return;
		}
		binaryTreeConverted.add(root.data);
		convert(root.left, binaryTreeConverted);
		convert(root.right, binaryTreeConverted);
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
		pairSum(root, 15);

	}

}
