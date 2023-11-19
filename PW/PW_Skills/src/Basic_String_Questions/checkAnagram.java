package Basic_String_Questions;

import java.util.Scanner;

public class checkAnagram {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		
		// remove space and convert it to lowercase
		str1= str1.replace(" ", "").toLowerCase();
		str2= str2.replace(" ", "").toLowerCase();
		
		int ch[]= new int[26];
		
		for (int i=0; i<str1.length(); i++) {
			ch[str1.charAt(i)-'a']++;
			ch[str2.charAt(i)-'a']--;
		}
		boolean flag= true;
		
		for (int count:ch) {
			if (count!=0) {
				flag=false;;
			}
		}
		if (flag) {
			System.out.println("It's an anagram String");
		}else {
			System.out.println("Not anagram");
		}

		
	}

}
