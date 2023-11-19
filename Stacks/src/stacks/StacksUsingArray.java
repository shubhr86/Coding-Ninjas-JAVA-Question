package stacks;

public class StacksUsingArray {
	
	private int data[];
	private int top; // is the index of the topmost element of stack
	
	public StacksUsingArray(){
		data= new int [10];
		top = -1; // when there is no element, means stack is null
	}
	public StacksUsingArray(int capacity){
		data= new int [capacity]; // user can choose size of the array
		top = -1; // when there is no element, means stack is null
	}
	public boolean isEmpty () {
		return (top== -1);
	}
	
	public int size() {
		return top+1;
	}

	public int top() throws StackemptyException {
		if (size()== 0) {
			//StackEmptyException
			StackemptyException e= new StackemptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int element)  {
		if(size()== data.length) {
			// stack Full
			doubleCapacity();
			
			
			
		}
		top++;
		data[top]= element;
	}
	private void doubleCapacity() {
		int temp[]= data;
		data= new int [temp.length*2];
		for (int i=0; i<=top;i++) {
			data[i]= temp[i];
		}
	}
	
	
	public int pop() throws StackemptyException {
		if (size()== 0) {
			//StackEmptyException
			StackemptyException e= new StackemptyException();
			throw e;
		}
		int temp= data[top];
		top--;
		return temp;
	}
}
