package ticTacToe;

import java.util.Arrays;
import java.util.List;


public class Game {
	static String[][] board;
	
	Game() {
		buildBoard();
	}	
	
	public static void startGame() {
		System.out.println("");
		System.out.println("Really starting the game now :");
		System.out.println("");
		
		printBoard();
	}
	
	public static void printBoard() {
		if (board != null) {		
			for (String[] line : board) {
				
				List<String> strList = Arrays.asList(line);
				System.out.println(String.join(" ", strList));
			}
		}
	}
	
	public static void updateBoard(PlayerSymbole symbol, int line, String column) {
		int columnIndex;
		
		switch(column) {
			case("A"):
				columnIndex = 1;
				break;
			case("B"):
				columnIndex = 2;
				break;
			case("C"):
				columnIndex = 3;
				break;
			default:
				System.out.println("Mauvais nom de colonne...");
				System.out.println("Indiquez la colonne A, B ou C.");
				return;
		}
		
		if (line < 0 || line > 3) {
			System.out.println("Mauvais numéro de ligne...");
			System.out.println("Indiquez un numéro entre 1 et 3 compris.");
			return;
		}
		
		
		
	}
	
	public static void buildBoard() {
		String[][] newBoard = {{" ", "A", "B", "C"}, {"1", "_", "_", "_"}, {"2", "_", "_", "_"}, {"3", "_", "_", "_"}};
		board = newBoard;
	}
	
	
}
