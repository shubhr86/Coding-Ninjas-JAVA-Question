package TreeBasic;



public class Node<T> {
	private T data;
	Node<T> next;
	
	Node(T data){
		this.setData(data);
		next=null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	

}
