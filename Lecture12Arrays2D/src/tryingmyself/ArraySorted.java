package tryingmyself;

public class ArraySorted {

	public static void main(String[] args) {
		boolean issorted= true;
		int arr[]= {15,20,36,38,38};
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i] > arr[i+1]) {
				issorted =false;
			
				break;
			}
		}
		if (issorted) {
			System.out.println("Array Sorted");
		}else {
			System.out.println("Array Not Sorted");
		}

	}

}
