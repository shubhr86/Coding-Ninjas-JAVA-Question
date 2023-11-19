package selftest;

import java.util.Scanner;

public class name_school_class {
	

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		// name
		System.out.println("Enter Your Name");
		String str = s.nextLine();
		// class
		System.out.println("Enter Your Class");
		String str1 = s.nextLine();
		// school name
		
		System.out.println("Enter Your School Name");
		String str3 = s.nextLine();
		System.out.println("My Name Is: "+str);
		System.out.println("I'm Studing in: "+str1+ " Class");
		System.out.println("My School Name Is: "+str3);

	}

}
