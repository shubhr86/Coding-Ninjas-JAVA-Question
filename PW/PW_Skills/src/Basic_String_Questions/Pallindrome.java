package Basic_String_Questions;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String[] args) {
		// checking the string is pallindrome or not?
		
		Scanner s = new Scanner(System.in);
		String s1= s.nextLine();
		String result="";
		for (int i=s1.length()-1; i>=0; i--){
			result+=s1.charAt(i);
		}
		if (result.equals(s1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		
		}
   }
}