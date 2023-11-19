package selftest;

public class penalty {
	
	public static int goal(String s) {
		char penality='2';
		int ans=0;
		for (int i=0; i<s.length()-1; i++) {
			
			if (penality== s.charAt(i) && s.charAt(i+1) =='1') {
				ans++;
			}
			
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String s="1012012112110";
		System.out.println(goal(s));

	}

}
