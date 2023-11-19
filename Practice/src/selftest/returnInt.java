package selftest;

import java.util.ArrayList;

public class returnInt {
	
	
	public static ArrayList<String> extractIntegerWords(String s) 
	    { 
		  ArrayList<String> al = new ArrayList<String>();
	        int i = 0;
	        int len = s.length();
	        while(i<len){
	            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
	                String ans = "";
	                while(i<len && s.charAt(i)>='0' && s.charAt(i)<='9'){
	                    ans += s.charAt(i);
	                    i++;
	                }
	                al.add(ans);
	                ans = "";
	            }
	            i++;
	        }
	        return al;
	    }
	

	


	public static void main(String[] args) {
		String s="1my name is suhbha69";
		ArrayList<String> ans =extractIntegerWords(s);
		for (int i=0; i<ans.size(); i++) {
			System.out.print(ans.get(i)+" ");
		}

	}

}
