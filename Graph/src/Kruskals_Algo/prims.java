package Kruskals_Algo;

import java.util.Scanner;

public class prims {
	
	private static void prims(int[][] adjanceyMatrix) {
		int v= adjanceyMatrix.length;
		boolean visited[]= new boolean[v];
		int weight []= new int [v];
		int parent[]= new int [v];
		weight[0]= 0;
		parent[0]= -1;
		for (int i=1; i < v ; i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		for (int i=0 ; i < v ; i++) {
			// pic min weight
			int Minvertex= findMinVertex(weight, visited);
			visited[Minvertex] = true;
			
			// exploring unvisited neighour
			
			for (int j=0; j < v; j++) {
				if (adjanceyMatrix[Minvertex][j] !=0 && !visited[j]) {
					if (adjanceyMatrix[Minvertex][j] < weight [j]) {
						weight [j] =  adjanceyMatrix[Minvertex] [j];
						parent[j] = Minvertex;
					}
				}
			}
			
			
		}
		// print edges of MST
		for (int i=1; i < v; i++) {
			if (parent[i] < i ) {
				System.out.println(parent[i]+ " "+i+" "+ weight[i]);
			}else {
				System.out.println(i+ " "+parent[i]+" "+ weight[i]);
			}
		}
	}

	private static int findMinVertex(int[] weight, boolean[] visited) {
		int Minvertex = -1;
		for (int i=0; i < weight.length ; i++) {
			 if (!visited[i] && (Minvertex == -1 || weight[i]  < weight[Minvertex])) {
				 Minvertex = i;
			 }
		}
		return Minvertex;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int v= s.nextInt();
		int e= s.nextInt();
		int adjanceyMatrix[][] = new int [v][v];
		
		for (int i=0; i < e ; i++) {
			int v1= s.nextInt();
			int v2 = s.nextInt();
			int weight= s.nextInt();
			adjanceyMatrix[v1][v2]= weight;
			adjanceyMatrix[v2][v1]= weight;
			
		}
		prims(adjanceyMatrix);

	}

	

}
