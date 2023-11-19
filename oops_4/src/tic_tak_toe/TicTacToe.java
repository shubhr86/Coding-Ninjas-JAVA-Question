package tic_tak_toe;

import java.util.Scanner;

public class TicTacToe {
	private Player player1, player2;
	private board board;
	
	public static void main(String[] args) {
		TicTacToe t= new TicTacToe();
		t.startGame();
	}
	
	// function
	
	public void startGame() {
		Scanner s = new Scanner(System.in);
		// Player Input
		player1= takePlayerInput(1);
		player2=takePlayerInput(2);
		// using loop for changing p2 symbol , he might get same symbol twice so we taken care of this to using with while Loop
		while (player1.getSymbol()== player2.getSymbol()) {
			System.out.println("Symbol Already Take !! Pick Another");
			char symbol= s.next().charAt(0);
			player2.setSymbol(symbol);
		}
		// Create Board
		
		board= new board(player1.getSymbol(), player2.getSymbol());
		
		// conduct Game
		boolean player1Trun= true; // to check which player turn
		
		int status= board.INCOMPLETE;
		while (status == board.INCOMPLETE || status == board.INVALID) {
			
			if (player1Trun) {
				System.out.println("Player 1- "+ player1.getName()+ "'s turn");
			
			// Takeing cordinates where the players mark X or O
				System.out.println("Enter x: ");
				int x= s.nextInt();
				System.out.println("Enter y: ");
				int y= s.nextInt();
				
				// passing to board
				// giving move can be valid or not and directions
				
				 status=	board.move(player1.getSymbol(), x,y);
				
				
				if (status != board.INVALID) { // if invalid move
				player1Trun=false;
				board.print();
				
				}else {
					System.out.println("Invalid Move || Try Again");
				}
				
				
			}else {
				System.out.println("Player 2- "+ player1.getName()+ "'s turn");
				
				// Takeing cordinates where the players mark X or O
					System.out.println("Enter x: ");
					int x= s.nextInt();
					System.out.println("Enter y: ");
					int y= s.nextInt();
					
					// passing to board
					// giving move can be valid or not and directions
					
					 status= board.move(player2.getSymbol(), x,y);
					
					
					if (status != board.INVALID) {
				
						player1Trun=true;
						
						board.print();
						
						
					}else {
						System.out.println("Invalid Move || Try Again");
					}
			}
			
			
		}
		// Check Status
		
		if (status == board.PLAYER_1_WINS) {
			System.out.println("Player 1 - "+ player1.getName()+" Wins !!");
			
		}else if(status == board.PLAYER_2_WINS) {
			System.out.println("Player 2 - "+ player2.getName()+" Wins !!");
			
		}else {
			System.out.println("Draw !!");
		}
		
		
	}
	
	// Player function for Input
	
	private Player takePlayerInput(int num) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter Player "+num+" name: ");
		String name=s.nextLine();
		System.out.println("Enter Player "+num+" Symbol: ");
		char symbol= s.next().charAt(0);
		Player p = new Player(name,symbol);
		return p;
	}
	
}
