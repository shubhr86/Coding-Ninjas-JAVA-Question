package Basic_String_Questions;

public class sortAlphabatically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it's little bit difficult for me.
		
		String input ="algoritm";
		StringBuilder sb= new StringBuilder(input);
		int len= sb.length();
		
		for (int i=0; i<len-1; i++) {
			int minIndex= i;
			for (int j= i+1; j<len ;j++) {
				if (sb.charAt(j) <sb.charAt(minIndex)) {
					minIndex =j;
				}
			}
			if (minIndex !=i) {
				char temp= sb.charAt(i);
				sb.setCharAt(i, sb.charAt(minIndex));
				sb.setCharAt(minIndex, temp);
			}
		}
		System.out.println(sb);

	}

}
