package SearchingandShorting;

public class bubblesort {
	
	public static void bubblesort(int input[]) {
		for (int i=0; i<input.length-1;i++) {
			for (int j=0;j<input.length-1;j++) {
				if (input[j]>input[j+1]) {
					
					// swaping the index's
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int input[]= {0,1,0,1,0,2,2};
		bubblesort(input);
		for (int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		
	}

}
