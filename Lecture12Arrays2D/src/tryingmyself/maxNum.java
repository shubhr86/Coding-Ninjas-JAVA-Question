package tryingmyself;

public class maxNum {

	public static void main(String[] args) {
		int arr[]= {5,10,25,26,18,22};
		int max= Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if (max < arr[i]) {
				max = arr[i];
				
			}
			
		}
		System.out.println(max);
		

	}

}
