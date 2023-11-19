package Basic;

import java.util.Scanner;

public class graphjava {
	
	public static void printHelper(int edges[][], int startvertax, boolean visited[]	) {
		System.out.println(startvertax);
		visited[startvertax]= true;
		int n = edges.length;
		
		for (int i=0; i<n; i++) {
			if (edges[startvertax][i] == 1 && !visited[i]) {
				printHelper(edges, i, visited);
			}
		}
	}
	
	public static void print(int edges[][]) {
		boolean visited[]= new boolean [edges.length];
		for (int i=0; i < edges.length; i++) {
			if (!visited[i]) {
				printHelper(edges, i, visited);
			}
		}
	}
	
	public static void printBSHelper(int edges[][], int sv, boolean visted[]) {
		QueueUsingLL<Integer> q= new QueueUsingLL<>();
		q.enQueue(sv);
		int n = edges.length;
		visted[sv]= true;
		while (!q.isEmpty()) {
			int front =q.deQueue();
			System.out.println(front);
			for (int i=0; i<n; i++) {
				if (edges[front][i]==1 && !visted[i]) {
					q.enQueue(i);
					visted[i]= true;
				}
			}
		}
	}
	
	public static void BSF(int edges[][]) {
		boolean visted[] = new boolean [edges.length];
		for (int i=0; i<edges.length; i++) {
			if (!visted[i]) {
				printBSHelper(edges, i, visted);
			}
		}
		
	}

	public static void main(String[] args) {
		int n, e;
		
		Scanner s= new Scanner (System.in) ;
		n=s.nextInt();
		e=s.nextInt(); //edges
		int edges[][]= new int [n][n];
		
		for (int i=0; i<e; i++) {
			int firstvalue= s.nextInt();
			int secondvalue= s.nextInt();
			// same distance from 1 point to other
			
			edges[firstvalue][secondvalue]= 1;
			edges[secondvalue][firstvalue] = 1;

		}
		print(edges);
		System.out.println("BSF");
		BSF(edges);

	}

}
