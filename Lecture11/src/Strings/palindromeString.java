package Strings;

public class palindromeString {
	
	public static boolean outputpain(String str) {
		int i=0, j=str.length()-1;
		while (i<=j) {
			
			if (str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		String str="abad";
		System.out.print(outputpain(str));
		
		



	}

}
