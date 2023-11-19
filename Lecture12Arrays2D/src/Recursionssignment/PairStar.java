package Recursionssignment;

public class PairStar {
	public static String addStars(String s) {
		if (s.length()==1) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + addStars(s.substring(1, s.length()));
		}
		return s.charAt(0) + addStars(s.substring(1, s.length()));
	}

		

	public static void main(String[] args) {
		String input ="aaaa";
		System.out.println(addStars(input));


	}

}
