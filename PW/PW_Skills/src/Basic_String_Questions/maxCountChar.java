package Basic_String_Questions;

public class maxCountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = "aabbcddde";
        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxChar = ch;
                maxCount = count;
            }
        }

        System.out.println("The maximum occurring character is: " + maxChar);

	}

}
