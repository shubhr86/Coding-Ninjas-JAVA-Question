package StringsBasicWithArray;

public class subSequence {
	
	public static void subseq(String str, int startindex, String newString) {
		
		if (startindex== str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currentchar= str.charAt(startindex);
		// to be adding char
		subseq(str, startindex +1, newString+currentchar);
		
		// to not to be
		subseq(str, startindex +1, newString);
	}

	public static void main(String[] args) {
		String str= "abc";
		subseq(str, 0, "");

	}

}
