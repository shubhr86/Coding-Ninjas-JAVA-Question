package TreeBasic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class replaceNodeWithDepth {
	
	public static void replacewithdepth(Tree<Integer>root) {
		replacewithdepth(root, 0);
	}
	
	public static void replacewithdepth(Tree<Integer>root, int depth) {
		
		root.data=depth;
		
		for (int i=0; i< root.children.size();i++) {
		replacewithdepth(root.children.get(i),depth+1); 
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
	
	public static void printlevelWise(Tree<Integer> root) {
		Queue<Tree<Integer>> queue= new LinkedList<>();
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Tree<Integer> frontnode= queue.remove();
			if (frontnode==null) {
				if (queue.isEmpty()) {
					break;
				}
				System.out.println();
				queue.add(null);
			}else {
				System.out.print(frontnode.data+" ");
				for (int i=0;i<frontnode.children.size();i++) {
					queue.add(frontnode.children.get(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		Tree<Integer> input = takeInputLevelWise();
		 replacewithdepth(input);
				printlevelWise(input);

	}

}
