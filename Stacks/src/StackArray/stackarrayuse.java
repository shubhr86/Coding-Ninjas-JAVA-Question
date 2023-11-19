package StackArray;

public class stackarrayuse {

	public static void main(String[] args) {
		stackUsingArray stack= new stackUsingArray();
		stack.push(15);
		stack.push(18);
		stack.push(20);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}

	}

}
