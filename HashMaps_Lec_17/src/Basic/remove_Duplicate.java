package Basic;

import java.util.ArrayList;
import java.util.HashMap;

public class remove_Duplicate {
	
	
	public static ArrayList<Integer> removeDuplicate(int a[]){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> seen = new HashMap<>();
		for (int i=0; i<a.length; i++) {
			if (seen.containsKey(a[i])) { // when it's already added
				continue;
			}
			output.add(a[i]);
			seen.put(a[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		int a[] = {1,3,2,1,5,3,2,8};
		ArrayList<Integer> output= removeDuplicate(a);
		for (int i=0; i<output.size(); i++) {
			System.out.print(output.get(i)+" ");
		}
	}

}
