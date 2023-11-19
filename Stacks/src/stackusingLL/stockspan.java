package stackusingLL;

import java.util.Stack;

public class stockspan {
	
	public static int [] stockspan(int [] price) {
		int [] span = new int [price.length];
		Stack<Integer> stack= new Stack<>();
		span[0]=1;
		stack.push(0);
		for (int i=0;i<price.length;i++) {
			while (!stack.isEmpty() && price[i]>= price[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				span[i]=i+1;
			}else {
				span[i]=i-stack.peek();
			}
			stack.push(i);
		}
		return span;
	}
	
	public static void printarr(int arr[]){
		for (int i=0; i<arr.length;i++) {
			System.out.print((arr[i])+" ");
		}
		System.out.println();
			}
	
	public static void main(String[] args) {
		int arr[]= {60,70,80,100,90,75,80,120};
		int [] output= stockspan(arr);
		printarr(output);
	}

}
