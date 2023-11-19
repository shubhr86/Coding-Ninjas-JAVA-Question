package practiceIfelse;

import java.util.Scanner;

public class Class_AttenedorNot {

	private static final char Y = 0;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number Of classes Held");
		int numberofclasses= s.nextInt();
		System.out.println("Enter Number Of classes Attended");
		int classesAttended= s.nextInt();
		System.out.println("You have any medical issues? ");
		String medical= s.next();
		char c = 'Y';
		
		String Y= "You're Allowed";
		
	
		
		int attendence= (classesAttended*100)/numberofclasses;
		if (numberofclasses>365) {
			
          System.out.println("Enter Vaild Number Of classes Held");
          return;
		}
		if (classesAttended>numberofclasses) {
	          System.out.println("Enter Vaild Number Of classes Attended");
	          return;
			}
		
		if (attendence>75) {
			System.out.println("You're Allowed to Sit in Exam");
			
		
		} else {
			if (attendence<75) {
			System.out.println("You're Not Allowed to Sit in Exam");
		}

	}
	}
}
