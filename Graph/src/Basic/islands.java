package Basic;

import java.util.Scanner;

public class islands {

	public static int numConnected(int edges[][], int n) {
		int count =0;
		
		boolean visited[]= new boolean [n];
		 for (int i=0; i<n ; i++) {
			 if (!visited[i]) {
				 count ++;
				 dfs(edges, visited,i);
			 }
		 }
		
		// System.out.println(count);
		return count;
	}
	
	private static void dfs(int[][] edges, boolean[] visited, int sv) {
		
		visited[sv] = true;
		for (int i= 0; i< edges.length ; i++) {
			if (edges[sv][i] ==1 && !visited[i]) {
				dfs(edges, visited, i);
			} 
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		 int v= s.nextInt();
		 int e= s.nextInt();
		 int adjaryMatrix[][]= new int [v][v];
		 for( int i=0; i < e; i++) {
			 int v1= s.nextInt();
				int v2= s.nextInt();
				int weight = s.nextInt();
				adjaryMatrix[v1][v2]= weight;
				adjaryMatrix[v2][v1]= weight;
		 }
		 numConnected(adjaryMatrix, adjaryMatrix.length);
		 System.out.println(numConnected(adjaryMatrix, adjaryMatrix.length));
	}

}
