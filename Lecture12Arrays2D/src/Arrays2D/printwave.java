package Arrays2D;

public class printwave {
	
	public static void wavePrint(int mat[][]){
		
		int k=0, c=mat.length-1;
		if (mat.length!=0) {
			k=mat[0].length;
		}
		for (int j=0; j<k;j++) {
			for (int i=0;i<mat.length;i++) {
				
				if (j%2!=0) {
					System.out.print(mat[c][j]+" ");
					c--;
				} else {
					c=mat.length-1;
					System.out.print(mat[i][j]+" ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		 int[][] mat = { {1,2,3,4}, {5,6,7,8},{9,10,11,12} }; 
		
					wavePrint(mat);
					
	}

}
