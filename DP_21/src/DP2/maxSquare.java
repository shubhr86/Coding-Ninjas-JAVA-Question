package DP2;

public class maxSquare {
	
	public static int maxsquare(int input[][]) {
		if (input.length==0) {
			return 0;
		}
		if (input[0].length==0) {
			return 0;
		}
		int storage[][] = new int [input.length][input[0].length];
		
		for (int i=0; i<input.length; i++) {
			
				if (input[i][0]==1) {
					storage[i][0]=0;
				}else {
					storage[i][0]=1;
				}
			}
				
		for (int i=0; i<input[0].length; i++) {
			
			if (input[0][i]==1) {
				storage[0][i]=0;
			}else {
				storage[0][i]=1;
			}
		}
		
		for (int i=1; i<input.length;i++) {
			for (int j=1;j<input[0].length;j++) {
				if (input[i][j]!=0) {
					storage[i][j]=0;
				}else {
					storage[i][j]= 1+Math.min(storage[i-1][j-1],Math.min( storage[i][j-1],storage[i-1][j]));
				}
				
			}
		}
		int max=0;
		for (int i=0; i<storage.length;i++) {
			for(int j=0;j<storage[0].length;j++) {
				if (max < storage[i][j]) {
					max= storage[i][j];
				}
			}
		}
		return max;
			
	}

	public static void main(String[] args) {
		int input[][]= {{1 ,1 ,1},
							{1 ,1 ,1},
						{1 ,1 ,0}};
		System.out.println(maxsquare(input));

	}

}
