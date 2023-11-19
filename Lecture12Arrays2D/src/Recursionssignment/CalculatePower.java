package Recursionssignment;

import java.util.Scanner;

public class CalculatePower {
	
	public static int printpower(int a, int b) {
		
		if (b==1) {
			
			return a;
		}
		
		return printpower(a, b-1)*a;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		int b= s.nextInt();
		System.out.println(printpower(a, b));
		

	}

}
