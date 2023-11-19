package ifelse;

import java.util.Scanner;

public class printGreatestNumber {
	
	public static void printGreatestNumber() {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if (a<b) {
			System.out.println("Greater Number is: "+b);
		}if (a>b) {
			System.out.println("Greater Number is: "+a);

		}else if (a==b){
			System.out.println("Both are same");

		}
	}

	public static void main(String[] args) {
		// Take two int values from user and print greatest among them.
		printGreatestNumber();

	}

}
