package selftest;

public class twosum {
	public static int [] twosum(int[]arr, int num) {
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]+arr[j]==num) {
					return new int [] {i,j};
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int [] arr= {2,7,11,15};
		int num=9;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				System.out.println(twosum(arr, num));
			}
			
		}
		

	}

}
