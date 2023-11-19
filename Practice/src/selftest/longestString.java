package selftest;

public class longestString {
	
	 public static String longest(String names[], int n) {
		 String s="";
		 for (int i=0; i<n; i++) {
			if ( names[i].length() > s.length()) {
				s=names[i];
			}
		 }
		 return s;
	 }

	public static void main(String[] args) {
		int N = 5;
			String	names[] = { "Geek", "Geeks", "Geeksfor",
				  "GeeksforGeek", "GeeksforGeeks" };
			System.out.println(longest(names, N));
	}

}
