package Basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class getpathBSF {
	
	
	public static ArrayList<Integer> getPath(int edges[][], int sv, int ev, boolean visited[]){
		if (sv==ev) {
			ArrayList<Integer> ans = new ArrayList<>();
			ans.add(sv);
			visited[sv]= true;
			return ans;
		}
		QueueUsingLL<Integer> q= new QueueUsingLL<>();
		HashMap<Integer, Integer> h= new HashMap<>();
		ArrayList<Integer> ans = new ArrayList<>();
		q.enQueue(sv);
		visited[sv]=true;
		while (!q.isEmpty()) {
			int front =q.deQueue();
			for (int i=0; i<edges.length; i++) {
				if (edges[front][i]==1 && !visited[i]) {
					q.enQueue(i);
					visited[i]= true;
					h.put(i, front);
					if (i==ev) {
						ans.add(i);
						while(!ans.contains(sv)) {
							int b= h.get(i);
							ans.add(b);
							i=b;
						}
						return ans;
					}
				}
			}
		}
		return null;
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
        boolean []visited=new boolean[n];
        ArrayList<Integer> ans=getPath(edges,sv,ev,visited);
        
        if(ans!=null){
            for(int elem:ans){
                System.out.print(elem+" ");
            }
        }
	}

}
