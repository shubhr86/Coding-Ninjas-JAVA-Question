package Basic;
import java.util.*;
public class printIntegration {
	
	public static void interation(int [] arr1, int arr2[]) {
		HashMap<Integer, Integer> map= new HashMap<>();
		for (int i : arr1) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+ 1);
			}else {
				map.put(i, 1);
			}
		}
		for (int i :arr2) {
			// when map value above 0 or more than 0
			if (map.containsKey(i) && map.get(i) > 0) {
				System.out.print(i+" ");
				map.put(i, map.get(i) - 1);
			}
		}
	}

	public static void main(String[] args) {
		int arr1[]= {2,8,2,7,1,0,9,7,2,3};
		int arr2[]= {8,8,3,2,7,5,3,9,4,3,2,3};
		interation(arr1, arr2);
	}

}
