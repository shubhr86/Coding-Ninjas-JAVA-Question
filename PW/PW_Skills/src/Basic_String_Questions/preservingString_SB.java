package Basic_String_Questions;

public class preservingString_SB {

	public static void main(String[] args) {
		// this is for this casse only . it's not for the genral cases
		
		
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		sb.append("Think");
		sb1.append("Twice");
		System.out.println(sb.reverse()+" "+sb1.reverse());
	}

}
