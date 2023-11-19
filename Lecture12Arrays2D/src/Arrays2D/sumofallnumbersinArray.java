package Arrays2D;

public class sumofallnumbersinArray {
	public static void print2DArray(int[][] arr) {

// using nested Loop
	for(int i=0;i<arr.length;i++) { // for Rows
		
		for(int k=0;k<(arr.length-i);k++) {
			
			
			for(int j=0;j<arr[i].length;j++) {  //for coloum
				
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
	print2DArray(arr);

}
}