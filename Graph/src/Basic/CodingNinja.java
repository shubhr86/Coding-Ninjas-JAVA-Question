package Basic;


import java.util.Scanner;

public class CodingNinja {

	public static int l=0;

	public static int solve(String Graph[], int n, int m) {

		String str="CODINGNINJA";
		boolean visited[][]= new boolean [n][m];
		for (int i =0; i<n; i++	) {
			for (int j=0; j < m ; j++) {
				if (Graph[i].charAt(j)== str.charAt(0)) {
					solveHelper(Graph, n, m, i, j, str, visited);
					if (l>0) {
						return 1;
					}
				}
			}
		}
		return 0;

	}

	private static void solveHelper(String[] graph, int n, int m, int i, int j, String str, boolean[][] visited) {

		if (str.length()==0) {
			l++;
			return;
		}
		if (i < 0 || i > n || j<0 || j >=m) {
			return;
		}
		if (visited[i][j] == true) {
			return;
		}
		if (str.charAt(0) != graph[i].charAt(j)) {
			return;
		}
		visited[i][j]= true;
			
		solveHelper(graph, n, m, i-1, j, str.substring(1), visited);
		solveHelper(graph, n, m, i+1, j, str.substring(1), visited);
		solveHelper(graph, n, m, i, j-1, str.substring(1), visited);
		solveHelper(graph, n, m, i, j+1, str.substring(1), visited);
		solveHelper(graph, n, m, i-1, j-1, str.substring(1), visited);
		solveHelper(graph, n, m, i+1, j+1, str.substring(1), visited);
		solveHelper(graph, n, m, i-1, j+1, str.substring(1), visited);
		solveHelper(graph, n, m, i+1, j-1, str.substring(1), visited);
		
		visited[i][j]=false;
	}
	

	public static void main(String[] args) {
	
		

	}

}
