package Basic;

import java.util.HashMap;

public class uniqueString {
	
	public static String uniqueChar(String str) {
		String x="";
		HashMap<Character, Integer> map= new HashMap<>();
		for (int i=0; i<str.length();i++) {
			if (!map.containsKey(str.charAt(i))) {
				x=x+str.charAt(i);
				map.put(str.charAt(i), 1);
			}
		}
		return x;
	}

	public static void main(String[] args) {
		String s="ababacd";
		System.out.println(uniqueChar(s));

	}

}
