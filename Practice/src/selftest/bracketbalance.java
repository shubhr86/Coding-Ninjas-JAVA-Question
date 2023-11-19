package selftest;

public class bracketbalance {

	public  static boolean ispar(String x) {
		
		// this is based on emptying the String, if nothing left to delete then it is balances
		
		int max=Integer.MAX_VALUE;
		String s =x;
		
		while (max > s.length()) {
			
			max=s.length();
			
			s=s.replace("()", "");
			s=s.replace("{}", "");
			s=s.replace("[]", "");
		}
		// here if there is any other bracket remains it is not is going to be true,
		// that meeans it not balanced
		if (s.length() > 0) {
			return false;
		}
		return true;

	}



	public static void main(String[] args) {
		String x="()";
		System.out.println(ispar(x));

	}

}
