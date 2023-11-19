package timecomplexit;

public class findNuminArray {
	
	public static void findnum(int [] arr, int x) {
		int i=0;
		int ans=0;
		while (i<arr.length) {
			if (arr[i]==x) {
				ans=arr[i];
				System.out.println(ans);
				break;
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {5,7,8,9,2,1};
		
		int x=5;
		findnum(arr, x);
	}

}
