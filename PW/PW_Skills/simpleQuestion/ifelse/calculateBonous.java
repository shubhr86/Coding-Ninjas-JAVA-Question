package ifelse;

import java.util.Scanner;

public class calculateBonous {

	public static void main(String[] args) {
//		A company decided to give bonus of 7% to employee if his/her year of service is more than 5 years.
//		Ask user for their salary and year of service and print the net bonus amount.
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter your salary");
		int salary= s.nextInt();
		System.out.println("Please enter your year of service");
		int year= s.nextInt();
		
		if (year >5) {
			int bonus = (salary*7/(100));
			salary= salary+bonus;
			System.out.println("Hurry! you got bonus Rs."+bonus+" Now your net salary is Rs. "+salary);
		}else {
			System.out.println("Sadly you're not eligible for bonus. Never Give Up!!");

		}

	}

}
