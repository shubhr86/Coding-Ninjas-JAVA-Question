package TreeBasic;

import java.util.Scanner;

public class nodesGreaterThanX {
	
	public static int numNodeGreater(Tree<Integer> root,int x){
		
		int k= root.data;
		int count=0;
		if (k > x) {
			count++;
		}else {
			count=0;
		}
		for (int i=0;i<root.children.size();i++) {
			int greater= numNodeGreater(root.children.get(i), x);
			count=count+greater;
		}
		return count;
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
		Tree<Integer> k= takeInputLevelWise();
		int greater = numNodeGreater(k, 35);
		System.out.println("Greater Number is "+ greater);

	}

}
