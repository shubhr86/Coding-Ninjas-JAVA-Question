package Arrays2D;

public class MinimumLengthWord {
	public static String minLengthWord(String input){
		
		int start=0;
		int end=0;
		int space=0;
		int minlenght=Integer.MAX_VALUE;
		
		for (int i=0;i<=input.length();i++) {
			
			if (i==input.length() || input.charAt(i)==' ') {
				int lenght=i-space;
				if (minlenght>lenght) {
					minlenght=lenght;
					start=space;
					end=i;
				}
				space=i+1;
			}
		}
		return input.substring(start,end);
	}

	public static void main(String[] args) {
		String input="This is aa testting string";
		System.out.println(minLengthWord(input));

	}

}
