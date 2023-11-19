package practiceIfelse;

import java.util.Scanner;

public class BonoustotheSalary {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("What iS your salary ?");
		int n=s.nextInt();
		System.out.println("what is your Years of Service ?");
		int q=s.nextInt();
		
		int bonous= ((n*5)/100);
		if (q>5) {
			System.out.println("Your Net Bonous "+bonous);
		} else {
			System.out.println("Deeply Sorry! No Bonous "+n);
		}
		
	}

}
