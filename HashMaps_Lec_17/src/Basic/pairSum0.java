package Basic;

import java.util.HashMap;

public class pairSum0 {
	
	public static int PairSum(int input [], int size) {
		if (size==0) {
			return 0;
		}
		HashMap<Integer,Integer> map = new HashMap<>();
		int count =0;

		for (int i=0; i <input.length; i++) {
			if (map.containsKey(- input[i])) {
				count =  count + map.get(-input[i]);
				
				}
		
		  if(map.containsKey(input[i])){
             map.put(input[i], map.get(input[i])+1);
             
      }else {
    	  map.put(input[i],1);
      }
  }
		
		return count;
	}
	
	public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }


	public static void main(String[] args) {
		int [] arr= {0,0,0,0,0};
		System.out.println(PairSum(arr, 5));
	}

}
