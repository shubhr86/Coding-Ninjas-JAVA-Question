package Othello;

public class OthelloBoard {
	
	private int boardSize[][];
	final static int player1Symbol=1;
	final static int player2Symbol=2;
	
	public OthelloBoard() {
		boardSize= new int [8][8];
		boardSize[3][3]= player1Symbol;
		boardSize[3][4]=player2Symbol;
		boardSize[4][3]= player2Symbol;
		boardSize[4][4]=player1Symbol;
	}
	
	public void print () {
		for (int i=0; i < 8; i++) {
			for (int j=0; j< 8; j++	) {
				System.out.println(boardSize[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	// All Possible Direction
			int x_Dir[]= {-1,-1,0,1,1,1,0,-1};
			int y_Dir[]= {0,1,1,1,0,-1,-1,-1};

	public boolean move(int symbol, int x, int y) {
		
		// Handling Invalid Moves
		
		if (x <0 || x >= 8 ||  y < 0 || y>=8 || boardSize[x][y] !=0 ) {
			return false;
		}
		// Possible Moves
		
		boolean PossibleMove= false;
		for (int i=0; i< x_Dir.length; i++){
			int xStep=x_Dir[i];
			int yStep=y_Dir[i];
			int currentX= x+xStep;
			int currentY=y+ yStep;
			int count =0;
			
			while (currentX >=0 && currentX <8 && currentY >=0 && currentY <8) {
				if (boardSize[currentX][currentY]==0) {
					break;
				}else if(boardSize[currentX][currentY]!=symbol) {
					currentX+= xStep;
					currentY+= yStep;
					count ++;
				}else {
					if (count > 0) {
						PossibleMove= true;
						int convertX= currentX-xStep;
						int convertY= currentY-yStep;
						while (convertX != x || convertY != y) {
							boardSize[convertX][convertY]= symbol;
							convertX=convertX-xStep;
							convertY= convertY-xStep;
						}
						
					}
					break;
				}
			}
		}
		if (PossibleMove) {
			boardSize[x][y]= symbol;
		}
		return PossibleMove;
		
		
	}

}
