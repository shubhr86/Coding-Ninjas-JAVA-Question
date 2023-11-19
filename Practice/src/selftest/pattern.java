package selftest;

import java.util.ArrayList;

public class pattern {
	
	public static ArrayList<String> patter(String S){
		ArrayList<String >Ans= new ArrayList<>();
		
			
			for (int j=S.length(); j>=0; j--) {
				Ans.add(S.substring(0,j));
			}
		
		return Ans;
	}

	public static void main(String[] args) {
		String s="c";
		System.out.println(patter(s));

	}

}
