package Recursionssignment;

public class removeX {
	public static String removeX(String input){
		if (input.length()==0) {
			return input;
		}
		if (input.charAt(0) == 'x') {
			String smll= removeX(input.substring(1, input.length()));
			return smll;
		}
		return input.charAt(0)+ removeX(input.substring(1,input.length()));
	}

	public static void main(String[] args) {
		String input ="bncxxh";
		System.out.println(removeX(input));

	}

}
