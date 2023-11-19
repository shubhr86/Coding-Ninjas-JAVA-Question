package Arrays2D;

public class LeaderinArray {
	public static void leaders(int[] input) {
		for (int i=0;i<input.length;i++) {
			boolean smaller=true;
			for (int j=i+1;j<input.length;j++) {
				if (input[i]<input[j]) {
				smaller=false;
				break;
			}
		}
		
		if (smaller) {
			System.out.print(input[i]+" ");
		}
		}
	}

		

	public static void main(String[] args) {
		int [] input= {3 ,12 ,34 ,2, 0 ,-1};
		leaders(input);

	}

}
