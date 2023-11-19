package BST_II;

import java.util.Scanner;

import BST_I.BinaryTreeNode;
import BST_I.QueueUsingLL;

public class binarySearchTreeUse {

	

	public static void main(String[] args) {
	
		binarySearchTree b= new binarySearchTree();
		
		b.insertData(4);
		b.insertData(4);
		
		b.insertData(4);
		
		b.print();
		System.out.println("Other Version After Delete root");
		b.deletedata(4);
		b.deletedata(4);
		b.deletedata(4);
		
		
		b.print();
		System.out.println(b.hasData(4));

	}

}
