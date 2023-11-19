package practiceIfelse;

import java.util.Scanner;

public class Oldest_And_Young {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("First Person Age is: ");
		int person1= s.nextInt();
		System.out.println("Second Person Age is: ");
		int person2= s.nextInt();
		System.out.println("Third Person Age is: ");
		int person3= s.nextInt();
		
		if (person1==person2 && person2==person3) {
			System.out.println("All Persons Are Same at Age");
			return;
		}

		if (person1<person2 && person3<person2) {
			System.out.println("Person 02 Is Oldest with The age of "+ person2+" Years");
		} else 
			if (person2<person3 && person1<person3) {
				System.out.println("Person 03 Is Oldest with The age of "+ person3+" Years");
			}if (person2<person1 && person3<person1) {
				System.out.println("Person 02 Is Oldest with The age of "+ person1+" Years");
				
				
			} if (person1<person2 && person1<person3 ) {
				System.out.println("Person 01 Is Youngest with The age of "+ person1+" Years");
			} else 
				if (person2<person3 && person2<person1) {
					System.out.println("Person 02 Is Oldest with The age of "+ person2+" Years");
				}if (person3<person2 && person3<person1 ) {
					System.out.println("Person 03 Is Oldest with The age of "+ person3+" Years");

	}
			
}
}
