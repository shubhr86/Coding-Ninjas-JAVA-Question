package Kruskals_Algo;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Dijkstra {

	private static void dijkstra(int[][] adjacencyMatrix) {
		int v= adjacencyMatrix.length;
		boolean visited [] = new boolean[v];
		int distance[] = new int [v];
		distance[0] = 0;
		for (int i=1; i < v; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i=0; i < v-1; i++) {
			// find vertaex with min Distance

			int minvertex=	findMinVertex(distance, visited);
			visited[minvertex] = true;
			// explore neighbor

			for (int j=0 ; j< v; j++) {
				if (adjacencyMatrix[minvertex] [j] != 0 && !visited[j]
						&& distance[minvertex] != Integer.MAX_VALUE) {
					int newDistance = distance[minvertex] + (adjacencyMatrix[minvertex] [j]);
					if (newDistance < distance[j]) {
						distance[j] =  newDistance;
					}
				}
			}
		}
		
		// Print
		
		for (int i=0; i < v; i++) {
			System.out.println(i + " "+ distance[i]);
		}


	}



	private static int findMinVertex(int[] distance, boolean[] visited) {
		int minvertex= -1;
		for (int i=0; i< distance.length; i++) {
			if (!visited[i] && (minvertex == -1 || distance [i] < distance[minvertex])) {
				minvertex = i;
			}
		}
		return minvertex;
	}



	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int v= s.nextInt();
		int e= s.nextInt();
		int adjacencyMatrix[] []= new int [v][v];
		for (int i=0; i< e; i++) {
			int v1= s.nextInt();
			int v2= s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[v1][v2]= weight;
			adjacencyMatrix[v2][v1]= weight;
		}
		dijkstra(adjacencyMatrix);

	}



}
