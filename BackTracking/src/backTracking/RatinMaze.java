package backTracking;

public class RatinMaze {
	
	public static boolean ratInAMaze(int maze[][]){
		int l= maze.length;
		int path[][]=new int[l][l];
		
		return ratInAMazeHelper(maze, 0,0,path);
		
	}

	private static boolean ratInAMazeHelper(int[][] maze, int i, int j, int[][] path) {
		if (maze.length==0) {
			return false;
		}
		int l = maze.length;
		// check conditions maze 0 means block || path 1 means already visited
		if (i <0 || i>=l || j<0 || j>=l || maze[i][j] == 0 || path[i][j]==1) {
			return false;
		}
		// destination reached
		path[i][j] =1;
		if ( i ==l -1 && j == l-1) {
			
			for (int a =0; a<l; a++) {
				for (int b =0; b< l; b++) {
					System.out.print(path[a][b]+" ");
				}
				System.out.println();
			}
			path[i][j] =0;

			return true;
		}
		// Explore other options
			
			boolean op1= ratInAMazeHelper(maze, i+1, j, path);
			boolean op2= ratInAMazeHelper(maze, i, j+1, path);
			boolean op3= ratInAMazeHelper(maze, i, j-1, path);
			boolean op4= ratInAMazeHelper(maze, i-1, j, path);
			
			
			
			if (op1 ) {
				 return true;
			}
			if (op2 ) {
				 return true;
			}
			if (op3 ) {
				 return true;
			}
			if (op4 ) {
				 return true;
			}
			
			path[i][j] =0;

			return false;
		}
		
	

	public static void main(String[] args) {
		int mat[][]= {{ 1 ,1 ,0},
						{1, 1, 0},
						{1, 1, 1}};
		boolean ans = ratInAMaze(mat);
		System.out.println(ans);

	}

}
