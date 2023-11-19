package StackusingQueue;



public class QueueStackUse {

	public static void main(String[] args) {
		StackUsingQueue queue= new StackUsingQueue<>();
		for (int i=1;i<=5;i++) {
			queue.push(i);
			
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.pop()+" ");
		}

	}

}
