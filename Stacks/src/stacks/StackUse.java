package stacks;

public class StackUse {

	public static void main(String[] args) throws StackemptyException, stackFullException{
		StacksUsingArray stack= new StacksUsingArray();
		for (int i=1; i<=15;i++) {
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}

	}

}
