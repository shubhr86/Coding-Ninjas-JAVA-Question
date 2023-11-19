package TreeBasic;

import java.util.Scanner;

public class havingSumofchildren {
	
	public static int sum(Tree<Integer> root){
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
        return sum;
    }
    
	public static Tree<Integer> maxSumNode(Tree<Integer> root){
		// Write your code here
        
        int sumRoot=sum(root);
        int max=Integer.MIN_VALUE;
        Tree<Integer> maxNode=null;
        for(int i=0;i<root.children.size();i++){
            Tree<Integer> maxNode1=maxSumNode(root.children.get(i));
            int sum=sum(maxNode1);
            if(sum>max){
                max=sum;
                maxNode=maxNode1;
            }
        }
        if(sumRoot>max){
            return root;
        }
        return maxNode;
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
		Tree<Integer> input = takeInputLevelWise();
		Tree<Integer> max= maxSumNode(input);
		if (max==null) {
			System.out.println(Integer.MIN_VALUE);
		}else {
			System.out.println(max.data);
		}
		
				

	}

}
