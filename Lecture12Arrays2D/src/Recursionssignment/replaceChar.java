package Recursionssignment;

public class replaceChar {
	
	public static String replaceCharacter(String input, char c1, char c2) {
	//base case
		if (input.length()==0) {
			return "";
		}

		char smallans=input.charAt(0);
		// if char 0 = c1
		if (input.charAt(0)==c1) {
			// replace it with c2
			 smallans= c2;
			
			input=c2 + input.substring(1);

		}
		return smallans+replaceCharacter(input.substring(1), c1, c2);
		
	}
	public static void main(String[] args) {
		String input="babacd";
		char c1='a';
		char c2='x';
		System.out.println(replaceCharacter(input, c1, c2));

	}

}
