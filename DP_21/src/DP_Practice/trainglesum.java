package DP_Practice;

public class trainglesum {
	
	public static int getMinimumValue(int[][] arr){
		return getMinimumValue(arr,0,0);
		
    }

	private static int getMinimumValue(int[][] arr, int i, int j) {
	
		int m=arr.length , n=arr[0].length;
		
		
		if (i==m-1 && j== n-1) {
			return arr[i][j];
		}
		if (i>=m || j>=n) {
			return Integer.MAX_VALUE;
		}
		int op1= getMinimumValue(arr, i+1, j);
		int op2= getMinimumValue(arr,i,j+1);
		int op3= getMinimumValue(arr,i+1,j+1);
		return arr[i][j]+ Math.min(op1, Math.min(op2, op3));
	}

	public static void main(String[] args) {
		int arr[][]={
                {4},
                {1, 3},
                {1, 2, 1,},
                {8, 4, 5, 1}
        };
		
		System.out.println(getMinimumValue(arr));
	}

}
