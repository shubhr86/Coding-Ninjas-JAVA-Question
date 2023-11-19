package stackusingLL;

import java.util.Stack;

public class checkredundantbracket {
	
	public static boolean check(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i=0; i<str.length();i++) {
			if (str.charAt(i)==')') {
				int count =0;
				while (stack.peek()!='(') {
					count++;
					stack.pop();
					
				}
				stack.pop();
				if (count ==0|| count ==1)
					return true;
			}
			else {
				stack.push(str.charAt(i));
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str="((a+b))";
		System.out.println(check(str));

	}

}
