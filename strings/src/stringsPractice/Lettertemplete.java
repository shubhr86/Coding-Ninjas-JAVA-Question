package stringsPractice;

public class Lettertemplete {

	public static void main(String[] args) {
		String str = "Hello, <|name|> thanks to you";
		str = str.replace("<|name|>","Shubham");
		System.out.println(str);

	}

}
