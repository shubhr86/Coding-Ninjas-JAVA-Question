package selftest;

public class reverseString {
	
	public static String reverse(String s) {
		int n =s.length()-1;
		int start=0;
		
		String ans ="";
		for (int i=n; i>=start;i--) {
			ans+=s.charAt(i);
		}
	
		return ans;
		
	}

	public static void main(String[] args) {
		String s="GeeksforGeeks";
		System.out.println(reverse(s));

	}

}
