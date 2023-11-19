package timecomplexit;

public class Uniqueelement {
	public static int findUnique(int[] arr) {
		int uniqueelement=0;
		for (int i=0;i<arr.length;i++) {
			uniqueelement= uniqueelement ^ arr[i];
		}
		return uniqueelement;
	}

	public static void main(String[] args) {
		int arr[]= {5,10,2,1,5,2,10,20,1};
		System.out.println(findUnique(arr));
	}

}
