package ArrayList;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList<Integer> list1= new ArrayList<>();
		list1.add(15); // 0 element
		list1.add(16); // 1 element
		System.out.println("Before Bound "+list1.get(1));
		list1.add(1, 37); // bound 37 on 1st element
		System.out.print(list1.get(1));
		System.out.println();
		System.out.print("How to Get ith Element in Array List ");
	
		for (int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		
	}

}
