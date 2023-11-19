package tryingmyself;

import java.util.Scanner;

public class printSum {
	
	public static void printsumoftwoNumbers(int num1, int num2) {
		int sum= num1+num2;
		System.out.println(sum);
	}

	public static void main(String[] args) {
			Scanner s = new Scanner (System.in);
			int n= s.nextInt();
			int m=s.nextInt();
			printsumoftwoNumbers(n, m);
	}

}
