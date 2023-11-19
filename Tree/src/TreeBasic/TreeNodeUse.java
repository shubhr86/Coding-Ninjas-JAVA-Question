package TreeBasic;
import java.util.*;
public class TreeNodeUse {
	
	public static Tree<Integer> takeInput(){
		int n;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Next Node Data");
		n=s.nextInt();
		Tree<Integer> root = new Tree<Integer>(n);
		
		System.out.println("Enter Number of Children for "+ n);
		int childcount=s.nextInt();
		for (int i= 0 ;i < childcount; i++) {
			Tree<Integer> child= takeInput();
			root.children.add(child);
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

	public static void main(String[] args) {
		Tree<Integer> n= takeInput();
		print(n);

	}

}
