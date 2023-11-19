package StringsBasicWithArray;

public class findoccurance {
	
	public static int first= -1;
	public static int last =-1;
	
	public static void findocc(String str, int startindex, char element) {
		
		if (startindex== str.length()) {
			System.out.println("First Index "+first);
			System.out.println("Last Index "+last);
			return;
		}
		
		char currentchat= str.charAt(startindex);
		if (currentchat == element) {
			if (first == -1) {
				first = startindex;
				
			}else {
				last = startindex;
			}
		}
		findocc(str, startindex+1, element);
		
	}

	public static void main(String[] args) {
		String str= "aabhuiabjhba";
		findocc(str, 0, 'a');
		

	}

}
