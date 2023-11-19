package Naturalnumber;

public class Allindicies {
	
	public static int[] allIndexes(int input[], int startindex, int x) {
		if (startindex == input.length) {
			int output[]=new int[0];
			return output;
		}
	int smallans[]=	allIndexes(input,startindex+1, x);
	if (input[startindex] == x) {
		int output[]= new int[smallans.length +1];
		output[0] = startindex;
		for (int i=0; i<smallans.length;i++) {
			output[i+1]= smallans[i];
			
		}
		return output;
	}else {
		return smallans;
	}
	}
	
	
	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, 0, x);
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,5,2,5,6,3,4,2,2};
		int[] ans=allIndexes(arr, 2);
		for(int i : ans) {
			System.out.print(i+" ");
		}
	}
}