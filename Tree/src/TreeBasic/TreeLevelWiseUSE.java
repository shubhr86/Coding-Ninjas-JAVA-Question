package TreeBasic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeLevelWiseUSE {
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
	public static void print(Tree<Integer> root) {
		String s = root.data+": ";
		
		for (int i=0; i<root.children.size() ;i++) {
			s= s + root.children.get(i).data+",";
		}
		System.out.println(s);
		// Loop for the children Nodes
		for (int i=0; i<root.children.size() ;i++) {
			print(root.children.get(i));
		}
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
		Tree<Integer> root= takeInputLevelWise();
		printlevelWise(root);

	}

}
