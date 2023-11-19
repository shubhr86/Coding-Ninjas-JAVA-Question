package ifelse;

import java.util.Scanner;

public class squareORNot {

	public static void main(String[] args) {
		//Take values of length and breadth of a rectangle from user and check if it is square or not.
		// simple providing area is rectangle or sqaure
		
		Scanner s = new Scanner (System.in);
		System.out.println("Please Enter The Length");
		int l = s.nextInt();
		System.out.println("Please Enter The Beadth");

		int b= s.nextInt();
		
		// checking it's sqaure not
		
		
		if (l ==b) {
			System.out.println("Sqaure");
		}else {
			System.out.println("Rectangle");

		}
		


	}

}
