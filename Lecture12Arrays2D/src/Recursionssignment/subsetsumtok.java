package Recursionssignment;

public class subsetsumtok {
	
	public static int [][] helper(int []input ,int k, int startindex){
		// base case 
		if(startindex== input.length) {
			int arr[][];
			if (k==0) {
				arr= new int [1][0];
			} else {
				arr= new int [0][0];
			}
			 return arr;
		} 
		int temp1[][]=helper(input, k-input[startindex], startindex+1);
		int temp2 [][]= helper(input, k, startindex +1);
		
		// copy all element temp1 into output
		int output[][]= new int [temp1.length+temp2.length][];
		for (int i=0;i<temp2.length;i++) {
			output[i]= new int [temp2[i].length];
			for (int j=0;j<temp2[i].length;j++) {
				output[i][j]= temp2[i][j];
			}
			
		}
		
		for (int i=0;i<temp1.length;i++) {
			output[i+temp2.length]= new int [temp1[i].length+1];
			output[i+temp2.length][0]= input[startindex];
			for (int j=1; j<output[i+temp2.length].length; j++) {
				output [i+temp2.length][j]= temp1[i][j-1];
			}
		}
			return output;
		
	}
	
	public static int [][] subsetofArray(int input [], int k) {
		k=6;
		return helper(input, k, 0);
	}

	public static void main(String[] args) {
		int[] input = {5 ,12 ,3 ,17, 1 ,18 ,15 ,3 ,17 };
		
		int output[][] = subsetofArray(input, 0);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}