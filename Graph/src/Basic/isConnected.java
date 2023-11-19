package Basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class isConnected {
	
public static void DFS(int[][] edges,int sv,boolean[] visited){
	
	
        
        visited[sv]=true;
        for(int i=0;i<edges.length;i++){
            if(edges[sv][i]==1 && !visited[i]){
                visited[i]=true;
                DFS(edges,i,visited);
            }
        }
        return;
    }
    public static boolean isConnected(int[][] edges){
    	if (edges.length ==0) {
    		return true;
    	}
        boolean [] visited=new boolean[edges.length];
        DFS(edges,0,visited);
        for(boolean elem:visited){
            if(elem==false){
                return false;
            }
        }
        return true;
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
        System.out.println(isConnected(edges));
        
	}


}
