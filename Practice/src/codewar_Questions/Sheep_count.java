package codewar_Questions;

public class Sheep_count {
	
	public static String countingSheep(int num) {
		String s =" sheep...";
		String temp="";
		for (int i=1 ; i<= num; i++) {
			temp+=i+s;
		}
		return temp;
	}

	public static void main(String[] args) {
		int num= 4;
		System.out.println(countingSheep(num));

	}

}
