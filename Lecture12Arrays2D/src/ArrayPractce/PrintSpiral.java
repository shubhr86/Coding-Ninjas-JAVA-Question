package ArrayPractce;

public class PrintSpiral {
	
	public static void spiralPrint(int matrix[][]){
		if(matrix.length==0){
            return;
        }
        int rowS=0,colS=0,rowE=matrix.length-1;
        int colE=matrix[0].length-1;
        // int i=0,j=0,c=0;
        int mul=matrix.length*matrix[0].length;

		while(rowS<=rowE && colS<=colE){
			for(int i=rowS; i<=colE; i++){
				System.out.print(matrix[rowS][i]+" ");
			}
 //     while(c<mul){
    //  	while(j<=colE){
    //         System.out.print(matrix[i][j]+" ");
    //         c++;
    //         j++;
    //     }
    //     rowS+=1;
    //     i=rowS;
    //     j--;
	for(int j=rowS+1;j<=rowE;j++){
		System.out.print(matrix[j][colE]+" ");
	}

    //     while(i<=rowE){
    //         System.out.print(matrix[i][j]+" ");
    //         c++;
    //         i++;
    //     }
    //     colE-=1;
    //     j=colE;
    //     i--;
	if(rowS+1<=rowE){
		for(int k=colE-1; k>=rowS;k--){
			System.out.print(matrix[rowE][k]+" ");
		}
	}
    //     while(j>=colS){
    //         System.out.print(matrix[i][j]+" ");
    //         c++;
    //         j--;
    //     }
    //     rowE-=1;
    //     i=rowE;
    //     j++;
	if(colS+1<=colE){
		for(int k=rowE-1;k>rowS;k--){
			System.out.print(matrix[k][colS]+" ");
		}
	} 
    //     while(i>=rowS){
    //         System.out.print(matrix[i][j]+" ");
    //         c++;
    //         i--;
    //     }
    //     colS+=1;
    //     i++;
    //     j=colS;    
       
    // }
	rowS++;
	rowE--;
	colS++;
	colE--;
		}
    
}

	

	public static void main(String[] args) {
		 int[][] mat = { {1,2,3,4}, {5,6,7,8},{9,10,11,12}, {13,14,15,16} }; 
		 spiralPrint(mat);

	}

}
