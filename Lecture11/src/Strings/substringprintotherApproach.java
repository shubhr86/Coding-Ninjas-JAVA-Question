package Strings;

public class substringprintotherApproach {
	
	public static void substring(String str) {


	int n=str.length();
	// i= start and j= end
	for (int len=1; len<=n;len++) {
		
		for (int i=0; i<=n-len;i++) {
			
			int j= i+len-1;
			
			System.out.println(str.substring(i,j+1));
		}
	}
	
}

public static void main(String[] args) {
	String str="pqrs";
	substring(str);
}
}
