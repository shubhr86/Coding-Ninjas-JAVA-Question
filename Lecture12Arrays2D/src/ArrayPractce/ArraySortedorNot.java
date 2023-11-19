package ArrayPractce;

public class ArraySortedorNot {

	public static void main(String[] args) {
		boolean isSorted=true;
		int [] arr= {5,8,9,10,12};
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if (isSorted) {
			System.out.println("Sorted");
		} else {
			System.out.println("Not Sorted");
		}

	}

}
