package Kruskals_Algo;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight; // if want in increasing order
	}
}

public class Graph {
	
	public static void kruskal(Edge input[], int n) {
		Arrays.sort(input); // to sort use the implement comparable and override
		Edge output[]= new Edge[n-1];
		int parent[]= new int [n];
		for (int i=0; i<n; i++) {
			parent[i]= i;
		}
		
		
		
		int count =0;
		int i= 0;
		while (count != n-1) {
			Edge currentEdge= input[i];
			// cycle detect
			int sourceParent = findParent(currentEdge.source, parent);
			int destParent = findParent(currentEdge.dest, parent);
			if (sourceParent != destParent) {
				output[count] = currentEdge;
				count ++;
				parent[sourceParent] = destParent;
			
			
			}
			i++;  // i reperent which edge's we work
		}
		
		for ( int j=0; j<n-1; j++) {
			if (output[j].dest < output[j].source) {
				System.out.println(output[j].dest+" "+ output[j].source+" "+output[j].weight);
				
			}else {
				System.out.println(output[j].source+" "+ output[j].dest+" "+output[j].weight);

			}
					}
		
	}

	private static int findParent(int v, int[] parent) {
		if (parent[v] == v) { // if parent of element is different
			return v;
		}
		return findParent(parent[v], parent);
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("Total Number Of Vertices");
		int n =s.nextInt();
		System.out.println("Total Number Of Edges");
		int E= s.nextInt();
		Edge input[] = new Edge[E];
		// Initially everything is 0. so initialize the values using loop
		for (int i=0; i<E; i++) {
			input[i]= new Edge();
			input[i].source=s.nextInt();
			input[i].dest=s.nextInt();
			input[i].weight=s.nextInt();
		}
		kruskal(input,n);

	}

}
