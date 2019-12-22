package ticTacToe;

public enum PlayerSymbole {
	O ('O'),
	X ('X');
	
	private char value;
	
	public char asChar() {
		return value;
	}

	PlayerSymbole(char playerValue) {
        value = playerValue;
    }
}