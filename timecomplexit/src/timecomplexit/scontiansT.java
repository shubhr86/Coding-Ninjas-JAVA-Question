package timecomplexit;

public class scontiansT {
	
	public static boolean check(String a, String b, int a_index, int b_index) {
		if (b_index==b.length()) {
			return true;
		}
		if (a_index==a.length()) {
			return false;
		}
		if (b.charAt(b_index)==a.charAt(a_index)) {
			return check(a, b, a_index +1, b_index +1);
		}else {
			return check(a, b, a_index +1, b_index);
		}
	}
	
	public static boolean checkSequence(String a, String b) {
		return check(a, b, 0, 0);
	}
	
	


	public static void main(String[] args) {
		String s ="abchjsgsuohhdhyrikkkndd";
		String t="coding";
		System.out.println(checkSequence(s, t));

	}

}
