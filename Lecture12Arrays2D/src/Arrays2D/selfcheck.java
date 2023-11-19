package Arrays2D;

import java.util.Scanner;

public class selfcheck {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		
		int rows= s.nextInt();
		int cols= s.nextInt();
		int numbers [] []= new int [rows][cols];
		
		// input 
		  //rows
		
		for (int i=0; i<rows;i++) {
			// coloums
			for (int j=0; j<cols;j++) {
				numbers[i][j]= s.nextInt();
			}
		}
		
		// output
		
		for (int i=0; i<rows;i++) {
			for (int j= 0; j<cols;j++) {
				System.out.print(numbers[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
