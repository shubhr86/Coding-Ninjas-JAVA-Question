package Arrays2D;

import java.util.Scanner;

public class inputoutputIn2DArray {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
		System.out.println("Enter Number Of Rows");
		
		int rows=s.nextInt();
		System.out.println("Number Of coloums");
		
		int coloums =s.nextInt();
		
		int input [][] = new int [rows] [coloums];
		
		for (int i=0 ; i<rows; i++) {
			for (int j=0; j<coloums;j++) {
				System.out.println("Enter Element at "+i+"row"+j+"coloum");
		        input [i][j]=s.nextInt();
			}
		}
		
		for (int i=0; i<rows;i++) {
			for (int j=0; j<coloums;j++) {
				
				System.out.print(input [i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
