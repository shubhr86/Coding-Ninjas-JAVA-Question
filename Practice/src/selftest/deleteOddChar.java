package selftest;

public class deleteOddChar {
	
	public static String delete(String s) {
		String ans="";
		for (int i=0; i<s.length(); i++) {
			if (i%2==0) {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s="GeeksforGeeks";
		System.out.println(delete(s));

	}

}
