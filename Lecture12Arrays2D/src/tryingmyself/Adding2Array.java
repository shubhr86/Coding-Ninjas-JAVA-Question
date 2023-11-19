package tryingmyself;

public class Adding2Array {

	public static void main(String[] args) {
		int [][] arr1= {{4,5,6},
						{5,15,-3}};
		
		int [] [] arr2= {{14,3,2},
						{12,05,10}};
		
		int [] [] result= {{0,0,0},
							{0,0,0}};
		
		for (int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr1[i].length;j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
			
		}
		for (int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr1[i].length;j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		}

	}


