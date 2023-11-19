package Strings;

public class Allsubstrings {
	
	public static void substring(String str) {
		
		int n=str.length();
		// i= start and j= end
		for (int i=0; i<n;i++) {
			for (int j=i;j<n;j++) {
				
				System.out.println(str.substring(i,j+1));
			}
		}
		
	}

	public static void main(String[] args) {
		String str="pqrs";
		substring(str);
	

	}

}
