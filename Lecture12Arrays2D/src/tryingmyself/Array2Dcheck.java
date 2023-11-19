package tryingmyself;

public class Array2Dcheck {
	static boolean isSymmetric(int mat[][], int N)
	{
	    for (int i = 0; i < N; i++)
	        for (int j = 0; j < N; j++)
	            if (mat[i][j] != mat[j][i])
	                return false;
	    return true;
	}
	 
	// Driver code
	     
	  
	  public static void main (String[] args)
		 {
		            int mat[][] = { { 1, 2, 3 },
		            			{ 4, 5, 5 },
		            			{ 7, 8, 9 } };
		 
		    if (isSymmetric(mat, 3))
		        System.out.println(  "Yes");
		    else
		         
		        System.out.println("NO");
		         
		    }
		

		
		} 
		
		
	


