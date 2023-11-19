package Arrays2D;

public class LargestRowAndColom {
	
	public static int findLargest(int mat[][]){
		int max= Integer.MIN_VALUE;
		int row= -1; int col= -1;
		int index=0;
		int sum=0;
		
		if (mat.length==0) {
			System.out.println("row 0"+ max);
		} else {
			// Row wise
			for (int i=0;i<mat.length;i++) {
				sum=0;
				for (int j=0;j<mat[0].length;j++) {
					
					sum= sum+mat[i][j];
					
				}
				if (sum>max) {
					max=sum;
					row=i;
					index=1;
				}
				
			}
			//coloum wise
			for (int j=0;j<mat[0].length;j++) {
				sum=0;
				for (int i=0;i<mat.length;i++) {
					sum= sum+mat[i][j];
				}
				if (sum>max);
				max=sum;
				col=j;
				index=0;
			}
		}
		if (index == 1) {
			System.out.print("row " + row + " ");
		} else {
			System.out.print("column " + col + " ");
		}
		return sum;
	}
		
	

	public static void main(String[] args) {
		int [] [] mat= {{1,2,3},
		                {4,5,6},
		                {7,8,3}};
		
			
		System.out.print(findLargest(mat));

}
	}
