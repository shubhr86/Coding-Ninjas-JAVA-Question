package tryingmyself;

public class sumAndProductelementinArray {

	public static void main(String[] args) {
		int arr[]= {1,2,1,3,1};
		int arr1[]= {1,2,1,3,1};
		
		//Sum of Element
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
			
		}
		System.out.println(sum);
		
		// product
		
		int product=1;
		for (int i=0;i<arr1.length;i++) {
			product=product* arr1[i];
		}
		System.out.println(product);

	}

}
