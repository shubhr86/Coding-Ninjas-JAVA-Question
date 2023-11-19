package Strings;

public class RemoveDuplicates {
	public static String removeConsecutiveDuplicates(String str) {
		StringBuffer ans = new StringBuffer("");
		ans.append(str.charAt(0));
		
		for (int i=0; i<str.length(); i++) {
			 if (str.charAt(i) != ans.charAt(ans.length()-1)) {
				 
				 ans.append(str.charAt(i));
			 }
			
		}
		
		
		return ans.toString();
	}

	public static void main(String[] args) {
		String str ="aabb";
		System.out.println(removeConsecutiveDuplicates(str));

	}

}
