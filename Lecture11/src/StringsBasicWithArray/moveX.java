package StringsBasicWithArray;

public class moveX {
	
	public static void moveX(String s, int startindex, int count , String newString) {
		
		if (startindex== s.length()-1) {
			for (int i=0;i<=count;i++) {
				newString+='x';
			}
			System.out.println(newString);
			return;
		}
		
		char currentchar= s.charAt(startindex);
		if (currentchar == 'x') {
			count++;
			moveX(s, startindex +1 , count, newString);
		} else {
			newString+=currentchar;
			moveX(s, startindex +1, count, newString);
		}
	}

	public static void main(String[] args) {
		String s= "abxcxdxexx";
		moveX(s, 0, 0, "");

	}

}
