package Basic_String_Questions;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// means sting alphabts are uised to make new string (word)
		// not using any other aplphbat
		
		String s1="School Master";
		String s2= "The Classroom";
		
		//first replace the space
		s1 =s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		// convert to lowercase
		
		s1=s1.toLowerCase()	;
		s2=s2.toLowerCase()	;
		
		// convert it into char Array
		
		char arr1[]= s1.toCharArray()	;
		char arr2[]= s2.toCharArray();
		
		// sort the Arrays
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

}
