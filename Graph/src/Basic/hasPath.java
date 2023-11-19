package Basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hasPath {
	
	  public static boolean hasPathHelper(int[][] edges,int sv,int ev,boolean[] visited){
        if(ev>=edges.length){
            return false;
        }
        if(edges[sv][ev]==1){
            return true;
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(sv);
        visited[sv]=true;
        while(!q.isEmpty()){
            int front=q.remove();
            for(int i=0;i<edges.length;i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        if(visited[ev]==true){
            return true;
        }else{
            return false;
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
      int sv=sc.nextInt();
      int ev=sc.nextInt();
      boolean []visited=new boolean[edges.length];
      boolean ans=hasPathHelper(edges,sv,ev,visited);
      System.out.println(ans);
	}
}


