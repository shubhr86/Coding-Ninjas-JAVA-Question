package selftest;

import java.util.ArrayList;
import java.util.List;

public class splitString {
	
	public static List<String> split(String S){
		
		
		
		
		List<String> ans= new ArrayList<>();
		String alpha = "", digits = "", spclChars = "";
		
		for (int i=0; i<S.length() ;i++) {
			if (S.charAt(i) >='A' && S.charAt(i) <='Z') {
				alpha= alpha+ S.charAt(i);
			}
			else if ( S.charAt(i) >='a' && S.charAt(i) <='z') {
				alpha= alpha+ S.charAt(i);
			}
			else if (S.charAt(i)>='0' && S.charAt(i) <='9') {
				digits+=S.charAt(i);
			}else {
				spclChars+=S.charAt(i);
			}
		}
		ans.add(alpha);
		ans.add(digits);
		ans.add(spclChars);
		
		return ans;
		
	}

	public static void main(String[] args) {
		String s ="01!shubh58*8B#!";
		System.out.println(split(s));

	}

}
