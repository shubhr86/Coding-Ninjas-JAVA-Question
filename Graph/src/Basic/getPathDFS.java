package Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class getPathDFS {
	
	 public static ArrayList<Integer> getPath(int[][] edges,int sv,int ev,boolean []visited){
		 if (sv==ev) {
			 ArrayList<Integer> list= new ArrayList<>();
			 visited[sv]= true;
			 list.add(sv);
			 return list;
		 }
		 visited[sv]= true;
		 for (int i=0; i<edges.length; i++) {
			 if (edges[sv][i]==1 && !visited[i]) {
				 ArrayList<Integer> arr= getPath(edges, i, ev, visited);
				 if (arr!=null) {
					 arr.add(sv);
					 return arr;
				 }
			 }
		 }
		 return null;
	 }

	public static void main(String[] args) {
		int n, e;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		e=s.nextInt();
		int edges[][]= new int [n][n];
		for (int i=0; i<e; i++) {
			int fv=s.nextInt();
			int sv= s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		int sv=s.nextInt();
		int ev=s.nextInt();
		boolean [] visited = new boolean[n];
		ArrayList<Integer> ans = getPath(edges, sv, ev, visited);
		if (ans!=null) {
			for (int element:ans) {
				System.out.print(element+" ");
			}
		}

	}

}
