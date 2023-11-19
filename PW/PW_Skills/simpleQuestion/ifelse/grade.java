package ifelse;

import java.util.Scanner;

public class grade {
	
	public static void printGrades() {
		Scanner s = new Scanner (System.in);
		int number = s.nextInt();
		
		if (number >80) {
			System.out.println("Your grade is: "+"A");
		}else if (number >60 && number <=80) {
			System.out.println("Your grade is: "+"B");
		}
		else if (number >50 && number <=60) {
			System.out.println("Your grade is: "+"C");
		}
		else if (number >45 && number <=50) {
			System.out.println("Your grade is: "+"D");
		}else if (number >=25 && number <=45) {
			System.out.println("Your grade is: "+"E");
		}else if (number<25){
			System.out.println("Your grade is: "+"F");
		}
	}

	public static void main(String[] args) {
		/*
		 * 
			A school has following rules for grading system:
			a. Below 25 - F
			b. 25 to 45 - E
			c. 45 to 50 - D
			d. 50 to 60 - C
			e. 60 to 80 - B
			f. Above 80 - A
			Ask user to enter marks and print the corresponding grade.
		 */
		printGrades();
	}

}
