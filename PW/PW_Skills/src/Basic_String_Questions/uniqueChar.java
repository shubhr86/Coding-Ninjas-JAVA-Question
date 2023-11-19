package Basic_String_Questions;

public class uniqueChar {

	public static void main(String[] args) {
		 String str = "abcdssefg";
	        boolean hasUniqueChars = true;

	        for (int i = 0; i < str.length(); i++) {
	            char ch1 = str.charAt(i);
	            for (int j = i + 1; j < str.length(); j++) {
	                char ch2 = str.charAt(j);
	                if (ch1 == ch2) {
	                    hasUniqueChars = false;
	                }
	            }
	            if (!hasUniqueChars) {
	                break;
	            }
	        }

	        if (hasUniqueChars) {
	            System.out.println("The string contains all unique characters.");
	        } else {
	            System.out.println("The string does not contain all unique characters.");
	        }
	    }

}
