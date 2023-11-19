package selftest;

public class replace_0_1 {
	
	public static String onesComplement(String S,int N){
		String ans ="";
		for (int i=0; i<N; i++) {
			if(S.charAt(i)=='0') {
			ans+='1';
			}else {
				ans+='0';
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String s="101";
		System.out.println(onesComplement(s, 3));

	}

}
