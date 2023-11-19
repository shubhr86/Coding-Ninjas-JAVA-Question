package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class connectedComponents {
	
	public static void connected(int edges[][], boolean vistited[], ArrayList<Integer> arr, int sv) {
		vistited[sv]=true;
		arr.add(sv);
		for (int i=0; i<edges.length; i++) {
			if (edges[sv][i]==1 && !vistited[i]) {
				connected(edges, vistited, arr, i);
			}
		}
	}
	public static void helper(int [][] edges) {
		boolean visited[]= new boolean [edges.length];
		
		for (int i=0; i<edges.length; i++) {
			if (!visited[i]) {
				ArrayList<Integer> array= new ArrayList<>();
				connected(edges, visited, array, i);
				Collections.sort(array);
				for (int j=0;j<array.size(); j++) {
					System.out.print(array.get(j)+" ");
				}
				System.out.println();
				
			}
		}
	}

	public static void main(String[] args) {
			int n;
	        int e;
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        e=sc.nextInt();
	        int edges[][]=new int[n][n];
	        for(int i=0;i<e;i++){
	            int fv=sc.nextInt();
	            int sv=sc.nextInt();
	            edges[fv][sv]=1;
	            edges[sv][fv]=1;
	        }
	        helper(edges);
		}
	}


