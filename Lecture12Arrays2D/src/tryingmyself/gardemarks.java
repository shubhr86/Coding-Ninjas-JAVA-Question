package tryingmyself;

import java.util.Scanner;

public class gardemarks {
	
	public static void grade(int n) {
		if (n>100) {
			System.out.println("Enter a Vaild Marks");
			return;
		}
		if (n>=91) {
			System.out.println("Grade Is AA");
		} else if (n>=81 && n<=90) {
			System.out.println("Grade Is AB");
		} else if (n>=71 && n<=80) {
			System.out.println("Grade Is BB");
		}else if (n>=61 && n<=70) {
			System.out.println("Grade Is BC");
		} else if (n>=51 && n<=60) {
			System.out.println("Grade Is CD");
		}else if (n>=41 && n<=50) {
			System.out.println("Grade Is DD");
		} else if (n<=40) {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int marks=s.nextInt();
		grade(marks);

	}

}
