package Basic;


import java.util.ArrayList;
import java.util.LinkedList;

public class bfsTraversal {

	public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int pred[], int dist[]) {
		LinkedList<Integer> queue = new LinkedList<>();
		boolean visited[] = new boolean[v + 1];

		for (int i = 0; i < v; i++) {
			visited[i] = false;
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
		}
		visited[src] = true;
		dist[src] = 0;
		queue.add(src);

		while (!queue.isEmpty()) {
			int cur = queue.remove();
			for (int i = 0; i < adj.get(cur).size(); i++) {
				int neighbour = adj.get(cur).get(i);
				if (visited[neighbour] == false) {
					visited[neighbour] = true;
					dist[neighbour] = dist[cur] + 1;
					pred[neighbour] = cur;
					queue.add(neighbour);

					if (neighbour == dest) {
						System.out.println("Distance between source & destination: " + dist[dest]);
						return true;
					}
				}
			}
		}

		return false;
	}


	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		int v=6, e=8;
		int parent []= new int [v+1];
		int dist[] = new int [ v+1];
		boolean isReached = bfs(adj, 0, 2, v, parent, dist);
		System.out.println(isReached);
	}

}
