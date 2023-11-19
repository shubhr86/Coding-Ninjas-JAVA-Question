package Recursionssignment;

public class stringtoINT {
	public static int convertStringToInt(String input){
		if (input.length()==0) {
			return 0;
		}
		int m= (int)input.charAt(0)-48;
		int n= input.length();
		while (n!=1) {
			m*=10;
			n--;
		}
		return m+ convertStringToInt(input.substring(1, input.length()));
		
	}

		

	public static void main(String[] args) {
		String input ="12340";
		System.out.println(convertStringToInt(input));

	}

}
