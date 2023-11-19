package ArrayPractce;

public class Adding2DMartix2 {

	public static void main(String[] args) {
		int [] [] mat1= {{5,6,10},
				        {10,1,-5}};
		int [] [] mat2= {{15,9,10},
		                {2,11,18}};
		int [] [] mat3= {{0,0,0},
		                 {0,0,0}};
		
		for (int i=0; i<mat1.length;i++) {  // rows number of time that is 2
			for (int j=0;j<mat1[i].length;j++) { // cols number of time that is 3
				
				mat3[i][j]= mat1[i][j]+mat2[i][j];  //adding the Elements in mat3
			}
		}
		
		// output Loop
		
		for (int i=0; i<mat1.length;i++) {
			for (int j=0;j<mat1[i].length;j++) {
				
				System.out.print(mat3[i][j]+" ");
				
				mat3[i][j]= mat1[i][j]+mat2[i][j];
				
	}
			System.out.println("");

}
	}
}