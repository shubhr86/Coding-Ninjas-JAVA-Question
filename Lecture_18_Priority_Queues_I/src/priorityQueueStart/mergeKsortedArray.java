package priorityQueueStart;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mergeKsortedArray {
	
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		
		ArrayList<Integer> ans= new ArrayList<>();
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		// adding elements into input list
		 for (int i=0; i<input.size(); i++) {
			 ArrayList<Integer> temp= input.get(i);
			 for (int j=0; j<temp.size(); j++) {
				 pq.add(temp.get(j));
			 }
		 }
		 while (!pq.isEmpty()) {
			 ans.add(pq.remove());
		 }
		 return ans;
		
	}

		

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Value Of K");
		int k = s.nextInt();
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		while(k > 0) {
			int n = s.nextInt();
			ArrayList<Integer> current = new ArrayList<Integer>();
			for(int i = 0; i < n; i++) {
				current.add(s.nextInt());
			}
			input.add(current);
			k--;
		}
		ArrayList<Integer> output = mergeKSortedArrays(input);
		for(int i : output) {
			System.out.print(i + " ");
		}
	}
}
