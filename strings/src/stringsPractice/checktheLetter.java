package stringsPractice;

import java.util.Scanner;

public class checktheLetter {
	
	public static void isletterAvilable() {
		Scanner s = new Scanner (System.in);
		String str= s.nextLine();
		boolean avilable = false;
		for (int i=0;i <str.length();i++) {
			if (str.charAt(i)=='e') {
				avilable= true;
				break;
			}

		}
		System.out.println(avilable);
	}

	public static void main(String[] args) {
		isletterAvilable();

	}

}
