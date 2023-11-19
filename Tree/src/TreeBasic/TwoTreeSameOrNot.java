package TreeBasic;

import java.util.Scanner;

public class TwoTreeSameOrNot {
	
	public static boolean checkIdentical(Tree<Integer> root1, Tree<Integer> root2){
		
		if (root1==null && root2==null){
			return true;
		}
		
		if (root1.data!=root2.data) {
			return false;
		}
		if (root1.children.size()!=root2.children.size()) {
			return false;
		}
		
		for (int i=0; i< root1.children.size(); i++) {
			if ((!checkIdentical( root1.children.get(i), root2.children.get(i)))) {
				return false;
			}
		}
		return true;
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
		Tree<Integer> t1= takeInputLevelWise();
		Tree<Integer> t2= takeInputLevelWise();
		System.out.println(checkIdentical(t1, t2));

	}

}
