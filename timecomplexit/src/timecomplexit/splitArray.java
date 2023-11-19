package timecomplexit;

public class splitArray {
	
	public static boolean helper(int []arr, int startindex, int leftsum, int rightsum) {
		if (startindex==arr.length) {
			return leftsum== rightsum;
		}
		if (arr[startindex]%5==0) {
			leftsum+=arr[startindex];
		}
		else if (arr[startindex]%3==0) {
			rightsum+=arr[startindex];
		}else {
			return helper(arr, startindex +1, leftsum+arr[startindex], rightsum) || helper(arr, startindex +1, leftsum, rightsum+ arr[startindex]);
		}
		return helper(arr, startindex +1, leftsum, rightsum);
	}
	
	
	public static boolean splitArray(int input[]) {
		return helper(input, 0, 0, 0);
	}

	public static void main(String[] args) {
		int arr[]= {1 ,2,3};
		System.out.println(splitArray(arr));

	}

}
