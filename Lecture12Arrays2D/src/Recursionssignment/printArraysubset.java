package Recursionssignment;

public class printArraysubset {
	
	private static int [][] helperarray(int [] input, int startindex){
		// base case
		if (startindex== input.length) {
			return new int [1][0];
		}
		int [][] temp= helperarray(input, startindex +1);
		int [][] smallans= new int [temp.length*2][];
		
		// copy elements into jagged array
		for (int i=0; i<temp.length;i++) {
			smallans[i]= new int [temp[i].length];
			int smalltemp[]= temp[i];
			for (int j=0;j<temp[i].length;j++) {
				smallans[i][j]= smalltemp[j];
			}
		}
		//copy elements after adding the first element
		for (int i=0; i<temp.length;i++) {
			smallans[i+temp.length]= new int [temp[i].length+1];
			smallans[i+temp.length][0]= input[startindex];
			int [] smalltemp= temp[i];
			for (int j=1;j<=temp[i].length;j++) {
				smallans[i+temp.length][j]=smalltemp[j-1];
			}
		}
		return smallans;
	}
	
	public static int [][] subsetofArray(int input []) {
		
		
		return helperarray(input, 0);
		
	}

	public static void main(String[] args) {
		int[] input = {15, 20,12};
		int output[][] = subsetofArray(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}