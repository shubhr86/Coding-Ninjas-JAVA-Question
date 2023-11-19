package backTracking;

public class NQueen {
	
	public static void Queen(int n) {
		
		int board[][]= new int [n][n];
		
		Queen(n, board, 0);
	}

	private static void Queen(int n, int board[][],int row) {
		
		if (row ==n) {
			
			// Reach Valid Config
			
			for (int i=0; i< n; i++) {
				for (int j=0; j< n;  j++) {
					System.out.print(board[i][j]+" ");
				}
				

			}
			System.out.println();

			
			return;
		}
		// placing queen one by one to each row
		
		for (int i=0; i<n; i++) {
			if (isSafe(board,row, i,n)) {
				// place queen board [row]][i]
				board[row][i]=1;
				Queen(n, board, row+1);;
				// if no solution , then backtrack
				board[row][i]=0;
				
			}
			

		}
		
	}
	

	private static boolean isSafe(int[][] board, int row, int col, int n) {
		 int i, j;
		 
		 for (i=0;i<row;i++)
		    {
		        if (board[i][col]==1)
		            return false;
		    }
		        
			// Check upper diagonal on left side
		    for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
		        if (board[i][j] == 1) 
		            return false;
		        
			//Check upper right diagonal
		    for (i=row,j=col;i>=0 && j<n;i--,j++)
		        if (board[i][j] == 1) 
		            return false;
		 
		    return true; 
			
	}

	public static void main(String[] args) {
		
		int n =4;
		Queen(n);
		
		}

	}


