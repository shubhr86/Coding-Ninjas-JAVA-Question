package selftest;

public class lwertoupper {
	
	public static String uppercae(String S){
		StringBuilder sb = new StringBuilder();
		String [] words= S.split("\\S+");
		for(String word : words) {
			if (word.length() > 0) {
				String upperCase= word.substring(0,1).toUpperCase() + word.substring(1);
				sb.append(upperCase).append(" ");
			}
		}
		 
	       return sb.toString();
	      
	
	}

	

	public static void main(String[] args) {
		String S="s hubham kumar";
		 
	       System.out.println(uppercae(S));
	      
	}
}
