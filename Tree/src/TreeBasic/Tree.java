package TreeBasic;

import java.util.ArrayList;

public class Tree<T> {
	public T data;
	public ArrayList<Tree<T>> children;
	
	public Tree(T data) {
		this.data= data;
		children= new ArrayList<>();
	}
}
