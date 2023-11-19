package practiceIfelse;

import java.util.Scanner;

public class PrintGrades {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int Marks=s.nextInt();
		if (Marks>100) {
			System.out.println("Put Correct Marks");
			return;
		}
		
		
		if (Marks<25) {
			System.out.println("Your Grade is: F");
		} else {
			if (Marks>=25 && Marks<45) {
				System.out.println("Your Grade is: E");
			} else {
				if (Marks>=45 && Marks<50) {
					System.out.println("Your Grade is: D");
				}else {
					if (Marks>=50 && Marks<60) {
						System.out.println("Your Grade is: C");
					} else {
						if (Marks>=60 && Marks<80) {
							System.out.println("Your Grade is: B");
						}else 
								System.out.println("Your Grade is: A");
							}
			}
		}
		

	}

}
}

