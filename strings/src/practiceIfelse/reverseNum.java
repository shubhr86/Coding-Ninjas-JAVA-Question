package practiceIfelse;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Write 4 Digit number");
		int n= s.nextInt();
		int reverse = 0;

		while (n!=0) {
			int remndier= (n%10);
			reverse= reverse*10+remndier;
			n=n/10;
		}
		System.out.println(reverse);

	}

}
