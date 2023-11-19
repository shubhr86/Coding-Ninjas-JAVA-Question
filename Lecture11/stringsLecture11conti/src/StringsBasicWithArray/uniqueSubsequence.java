package StringsBasicWithArray;

import java.util.HashSet;

public class uniqueSubsequence {
	
	public static void uniquesubsequence(String str, int startindex, String newstring, HashSet<String> hashset) {
		if (startindex== str.length()) {
			if (hashset.contains(newstring)) {
				return;
			} else {
				System.out.println(newstring);
				hashset.add(newstring);
				return;
			}
		}
		
		char currentChar= str.charAt(startindex);
		// to be
		uniquesubsequence(str, startindex+1, newstring+currentChar, hashset);
		
		// to not added yet
		
		uniquesubsequence(str, startindex +1, newstring, hashset);

		
	}

	public static void main(String[] args) {
		String str="aaa";
		HashSet<String> set= new HashSet<>();
		uniquesubsequence(str, 0, "", set);


		
		
	}

}
