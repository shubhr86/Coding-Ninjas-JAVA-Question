package selftest;

public class onesComplement {
	
	
	public static int onesComplement(int N){
		
		String str= Integer.toBinaryString(N);
		String ans="";
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)=='1') {
				ans+='0';
			}else {
				ans+='1';
			}
		}
		int n=Integer.parseInt(ans,2);
		return n;
	}

	public static void main(String[] args) {
		int n=255;
		System.out.println(onesComplement(n));
	}

}
