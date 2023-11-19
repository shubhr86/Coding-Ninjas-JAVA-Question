package tryingmyself;

public class subArray {
	public static void printsubAray() {
		int arr[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		int mid=arr.length/2;
		for (int i=mid-2;i<arr.length-2;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		printsubAray();
		

	}

}
