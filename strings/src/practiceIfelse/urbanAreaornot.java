package practiceIfelse;

import java.util.Scanner;

public class urbanAreaornot {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("What is Your Age");
		int age = s .nextInt();
		System.out.println("What is Your Gender? M for male and F for Female");
		char gender= s.next().charAt(0);
		System.out.println("What is Your Maratial Status ? Y or N");

		char martial= s.next().charAt(0);
		
		if (gender=='F') {
			System.out.println("Works In Urban Areas");
		}
		if (gender=='M' && age>=20 && age<40) {
			System.out.println("Works AnyWhere");
		}
		if (gender=='M' && age>=40 && age<60) {
			System.out.println("Works In Urban Areas");
			

	} else {
		if (gender=='M' && age>=60) {
			System.out.println("ERROR");
	}
		

}
	}
}
	
