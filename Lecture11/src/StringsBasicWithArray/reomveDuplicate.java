package StringsBasicWithArray;

public class reomveDuplicate {
	
	public static boolean map[]= new boolean [26];
	
	public static void removeDuplicate(String str, int startindex, String newString) {
		//base case
		if (startindex== str.length()) { //string length reached
			System.out.println(newString);
			return;
		}
		
		char currentchar= str.charAt(startindex);
		
		if (map[currentchar-'a']==true) { // means char already found
			removeDuplicate(str, startindex+1, newString);
		} else { // if char not found, means char found first time
			newString+= currentchar; 
			map[currentchar-'a']= true; // updating value into the map Array
			removeDuplicate(str, startindex +1, newString);
		}
	}

	public static void main(String[] args) {
		String Str="acgcggabbaa";
		removeDuplicate(Str, 0, "");

	}

}
