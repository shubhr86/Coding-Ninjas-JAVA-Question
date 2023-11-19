package string;

public class concat {

	public static void main(String[] args) {
		   String input = "Hello, have a good day";
	        String result = "";

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	                ch == ' ' || ch == ',' || ch == '.') {
	                result += ch;
	            }
	        }

	        System.out.println("Original String: " + input);
	        System.out.println("Result: " + result);
		

	}

}
