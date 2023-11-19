package tryingmyself;

import java.util.Scanner;

public class canVoteOrNot {
	
	public static void canvotornot(int age) {
		if (age>=18) {
			System.out.println("Person can vote beacuse his/her age is: "+ age);
		}else {
			System.out.println("Person can't vote beacuse his/her age is: "+ age);
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int age = s.nextInt();
		canvotornot(age);

	}

}
