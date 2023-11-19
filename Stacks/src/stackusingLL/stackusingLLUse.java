package stackusingLL;

import stacks.StackemptyException;

public class stackusingLLUse {

	public static void main(String[] args) throws StackemptyException {
		
		StackusingLL<Integer> stack= new StackusingLL<>(); 

		for (int i=1; i<=5;i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}

	}

}
