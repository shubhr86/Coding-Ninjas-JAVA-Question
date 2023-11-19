package Arrays2D;

import java.util.Scanner;

public class foundNumberX {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int rows= s.nextInt();
		int cols= s.nextInt();
		
		int numbers [] []= new int [rows] [cols];
		
		// input 
		//rows
		for (int i=0; i<rows; i++) {
			// cols
			for (int j=0; j<cols;j++) {
				numbers [i][j]= s.nextInt();
			}
		}
				int x= s.nextInt();
				for (int i=0; i<rows;i++) {
					for (int j=0; j<cols; j++) {
						// compare x to indices
						
						if (numbers[i][j]==x) {
							System.out.println("Number is Found:"+ i+" "+","+j+" ");
						}
					}
				}

	}

}
