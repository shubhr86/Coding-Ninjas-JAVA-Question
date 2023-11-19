package backTracking;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pand {

	
	public static boolean isPalindrome(String str, int L, int R) {
        // Keep comparing characters while they are same
        while (R > L) {
        	if (str.length()/2!=0) {
        		if (str.charAt(L++) != str.charAt(R--)) {
                    return false;
                }
        	}
        	
            if (str.charAt(L++) != str.charAt(R--)) {
                return false;
            }
        }
        return true;
    }
	
	  
	    	public static void main(String[] args) {
	    		  Scanner scanner = new Scanner(System.in);

	    	        // Read the input string
	    	        String string = scanner.nextLine().trim();

	    	        // Read the number of queries
	    	        int Q = Integer.parseInt(scanner.nextLine());

	    	        // Process each query
	    	        for (int i = 0; i < Q; i++) {
	    	            String[] query = scanner.nextLine().split(" ");
	    	            int start = Integer.parseInt(query[0]);
	    	            int end = Integer.parseInt(query[1]);

	    	            if (isPalindrome(string, start, end)) {
	    	                System.out.println("Yes");
	    	            } else {
	    	                System.out.println("No");
	    	            }
	    
	   
	        }
	        
	    	}
}
	    
	 


