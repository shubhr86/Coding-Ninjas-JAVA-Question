package Strings;

public class removechar {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		
		StringBuffer Remove= new StringBuffer("");
		
		for (int i=0; i<str.length();i++) {
			
			if (str.charAt(i)!=ch) {
				Remove.append(str.charAt(i));
				
			}
		}
		
		return Remove.toString();
	}

	public static void main(String[] args) {
		String str= "aabccbaa";
		char ch='a';
		System.out.println(removeAllOccurrencesOfChar(str, ch));

	}

}
