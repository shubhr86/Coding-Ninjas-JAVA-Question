package backTracking;

public class printAllPAth {

	public static void ratInAMaze(int maze[][]){
		int l= maze.length;
		int path[][]=new int[l][l];
		
		 ratInAMazeHelper(maze, 0,0,path);
		
	}

	private static void ratInAMazeHelper(int[][] maze, int i, int j, int[][] path) {
		if (maze.length==0) {
			return;
		}
		int l = maze.length;
		// check conditions maze 0 means block || path 1 means already visited
		if (i <0 || i>=l || j<0 || j>=l || maze[i][j] == 0 || path[i][j]==1) {
			return;
		}
		// destination reached
		path[i][j] =1;
		if ( i ==l -1 && j == l-1) {
			
			for (int a =0; a<l; a++) {
				for (int b =0; b< l; b++) {
					System.out.print(path[a][b]+" ");
				}
				//System.out.println();
			}
			System.out.println();

			path[i][j] =0;

			return;
		}
		// Explore other options
			
			 ratInAMazeHelper(maze, i+1, j, path);
			 ratInAMazeHelper(maze, i, j+1, path);
			 ratInAMazeHelper(maze, i, j-1, path);
			 ratInAMazeHelper(maze, i-1, j, path);
			
			

			
			path[i][j] =0;

			
		}
		
	

	public static void main(String[] args) {
		int mat[][]= {{ 1 ,1 ,1},
						{1, 1, 0},
						{0, 1, 1}};
			ratInAMaze(mat);

	}

}


