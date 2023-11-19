package Strings;

public class reverseString {
	
	public static String outputstring(String str) {
		
		// for collecting elements of Strings need to use a Empty String
		
		String reversestring ="";
		
		// using for loop for every element
		
		for (int i= str.length()-1;i>=0;i--) {
			reversestring+= str.charAt(i);
		
		}
		return reversestring;
	}

	public static void main(String[] args) {
		String str = "shubham";
		String k= outputstring(str);
		System.out.print(k);
				

	}

}
