package tic_tak_toe;

public class Player {

	private String name; // Player name
	private char symbol; // X or O
	
	// constructor 
	
	public Player(String name, char symbol) {
		setName(name);
		setSymbol(symbol);
	}
	
	public void setSymbol(char symbol) {
		if (symbol != '\0') {
			this.symbol= symbol;
		}
		
	}
	public char getSymbol() {
		return this.symbol;
	}

	// Method to avoid empty name string issue or other like no symbol in name or alphabbat
	

	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name=name;
		}
		
	}
	public String getName() {
		return this.name;
	}
	
	 
}
