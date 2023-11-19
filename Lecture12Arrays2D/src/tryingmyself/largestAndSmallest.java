package tryingmyself;

public class largestAndSmallest {

	public static void main(String[] args) {
		int []arr= {5,7,9,15,1,2,6};
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		// largest
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>largest) {
				largest= arr[i];
			}
		}
		System.out.println("Largest Number");
		System.out.println(largest);
		
		// Smallest
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest Number");
		System.out.println(smallest);
	}

}
