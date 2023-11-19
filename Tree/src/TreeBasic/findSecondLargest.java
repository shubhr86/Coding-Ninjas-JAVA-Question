package TreeBasic;


import java.util.*;

public class findSecondLargest {
	
	public static Tree<Integer> findSecondLargest(Tree<Integer> root){
		if (root.children.size()==0) {
			return null;
		}
		Tree<Integer> first= root, second=null;
		int data=0;
		Queue<Tree<Integer>> queue= new LinkedList();
		queue.add(root);
		while (!queue.isEmpty()) {
			Tree<Integer> frontend= queue.remove();
			for (int i=0; i< frontend.children.size();i++) 
				queue.add(frontend.children.get(i));
				
				if (frontend.data > data) {
					if (frontend.data > first.data) {
						second= first;
						data= first.data;
						first= frontend;
					}
					else if(frontend.data < first.data) {
						second= frontend;
						data=second.data;
					}
				}
			
			
		}
		return second;
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
		Tree<Integer> s= findSecondLargest(input);
		System.out.println(s.data);

	}

}
