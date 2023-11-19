package TreeBasic;

import java.util.Scanner;

public class preOrder {
	
	public static void preOrder_Traversal(Tree<Integer>root) {
		if (root== null) {
			 return;
		}
		// in Pre-Order "Root print first' then children print left to right
		System.out.print(root.data+" ");
		for (int i=0; i< root.children.size();i++) {
			preOrder_Traversal(root.children.get(i));
		}
	}
	public static Tree<Integer>takeInputLevelWise(){
		Scanner s= new Scanner (System.in);
		System.out.println("Enter Root Data");
		int rootData= s.nextInt();
		// Create a Queue || Which will Add and Delete elements
		QueueUsingLL<Tree<Integer>> pendingNodes= new QueueUsingLL<>();
		// Create ROOT
		Tree<Integer> root = new Tree<Integer>(rootData);
		pendingNodes.enQueue(root);
		while (!pendingNodes.isEmpty()) {
			Tree<Integer>frontNode= pendingNodes.deQueue();
			System.out.println("Enter Number Of The children of "+ frontNode.data);
			int numChildren= s.nextInt();
			// if numchildren = 0 nothing will print that means there is no child
			for (int i=0;i<numChildren;i++) {
				System.out.println("Enter "+ i+"th Child of "+ frontNode.data);
				int child=s.nextInt();
				Tree<Integer> childrenNode= new Tree<Integer> (child);
				// for connecting with the parent
				frontNode.children.add(childrenNode);
				// pending ko enqueue kar diya uske child lene ke liye
				pendingNodes.enQueue(childrenNode);
			}
				
		}
		return root;
		
	}

	public static void main(String[] args) {
		Tree<Integer> input= takeInputLevelWise();
		 preOrder_Traversal(input);

	}

}
