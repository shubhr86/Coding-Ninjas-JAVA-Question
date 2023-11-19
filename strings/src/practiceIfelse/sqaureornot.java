package practiceIfelse;

import java.util.Scanner;

public class sqaureornot {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Put Length");
		int l=s.nextInt();
		System.out.println("Put Breadth");
		int b=s.nextInt();
		
		if (l==b) {
			System.out.println("Its a Square");
		} else {
			if (l!=b) {
				System.out.println("Its Not a Square");
		}
		}		

	}

}
