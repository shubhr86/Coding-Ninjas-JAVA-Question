package tic_tak_toe;

public class board {
	
	private char board [][];
	private int boardsize= 3;
	private char p1Symbol, p2Symbol; // player symbols
 
	//No. of cells of board that have been marked
	// marking both player moves
	private int count; 
	
	// Scenarios
	public final static int PLAYER_1_WINS=1;
	public final static int PLAYER_2_WINS=2;
	public final static int DRAW=3;
	public final static int INCOMPLETE=4;
	public final static int INVALID=5;
	
	
	
	
	// constructor
	
	public board (char p1Symbol, char p2Symbol) {
		board= new char[boardsize][boardsize];
		for (int i=0; i< boardsize; i++) {
			for (int j=0; j< boardsize ; j++) {
				board[i][j]=' '; // adding initially space of each cell
			}
		}
		this.p1Symbol= p1Symbol;
		this.p2Symbol= p2Symbol;
	}




	public int move(char symbol, int x, int y) {
		// conditions wher we can't move
		if (x < 0 || x >= boardsize || y< 0 || y >=boardsize || board[x][y]!=' ') {
			return INVALID;
		}
		// if move condition satisfy then move
		
		board[x][y]= symbol;
		count++;
		
		// checking conclusion
		// check row || horizontally
		if (board[x][0] == board[x][1] && board[x][0]  == board[x][2]) {
			 
			// checking which palyer's Symbol is that
			return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		// check Col || vertically
		if (board[0][y] == board[1][y] && board[0][y]  == board[2][y]) {
					 
					// checking which palyer's Symbol is that
			return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
				}
		
		
		// first diagonal; check
		if (board[0][0]!=' '&& board[0][0] == board[1][1] && board[0][0]  == board[2][2]) {
			 
			// checking which palyer's Symbol is that
	return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		// Second diagonal; check
		if (board[0][2]!=' '&& board[0][2] == board[1][1] && board[0][2]  == board[2][0]) {
			 
			// checking which palyer's Symbol is that
	return symbol == p1Symbol ? PLAYER_1_WINS : PLAYER_2_WINS;
		}
		
		// Draw condition
		if (count == boardsize * boardsize) {
			return DRAW;
		}
		return INCOMPLETE;
		
	}




	public void print() {
		System.out.println("----------------------");
		for (int i=0 ; i < boardsize ; i++) {
			for ( int j=0; j < boardsize ; j++) {
				System.out.print("| "+ board[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------");
	}
}
