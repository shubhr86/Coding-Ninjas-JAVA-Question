package practiceIfelse;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		if (n<0) {
			System.out.println("Absolute Value "+(-1*n));
		} else {
			System.out.println("Absolute Value "+(n));
		}

	}

}
