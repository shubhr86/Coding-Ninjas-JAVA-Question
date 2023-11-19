package timecomplexit;

public class duplicateinArray {
	
public static int duplicate(int[] arr) {
		
		
		int n=arr.length-2;
		int sum=0;
		for(int i : arr) {
			sum+=i;
		}
		return sum-(n*(n+1)/2);
		
	}
	public static void main(String[] args) {
		int[] arr= {0 ,9 ,7, 5, 4 ,9, 1 ,3 ,6};
		
		System.out.println(duplicate(arr));
	}
}

