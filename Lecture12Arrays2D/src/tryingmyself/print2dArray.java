package tryingmyself;

public class print2dArray {

	public static void main(String[] args) {
		 int rows = 3, columns = 2;
	        int[][] marks = new int[rows][columns];
	  
	        // initializing the array elements using for loop
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                marks[i][j] = i + j;
	            }
	        }
	  
	        // printing the first three rows of marks array
	        System.out.println("First three rows are: ");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.printf(marks[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


