package ticTacToe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Game {
	static String[][] board;
	static Player winner;
	static Player currentPlayer;
	
	Game() {
		buildBoard();
	}	
	
	public static void startGame() {
		Scanner sc = new Scanner(System.in);
		
		Player player1 = new Player("Toto", PlayerSymbole.O);
		Player player2 = new Player("Titi", PlayerSymbole.X);
		
		System.out.println("");
		System.out.println("Really starting the game now :");
		System.out.println("");
		
		
		printBoard();
		currentPlayer = player1;
		
		while (winner == null) {
			System.out.println("On what line do you want to play (between 1 and 3 included) :");
			int playerLine = sc.nextInt();
			System.out.println("You and to play on line " + playerLine + ".");
			System.out.println("On what column do you want to play (A, B or C) :");
			String playerColumn = sc.next().substring(0, 1);
			System.out.println("You and to play on column " + playerColumn + ".");
			
			updateBoard(currentPlayer.symbole, playerLine, playerColumn);
			
			currentPlayer = currentPlayer == player1 ? player2 : player1;
			winner = player1;
		}
	}
	
	public static void printBoard() {
		if (board != null) {		
			for (String[] line : board) {
				
				List<String> strList = Arrays.asList(line);
				System.out.println(String.join(" ", strList));
			}
		}
	}
	
	public static void updateBoard(PlayerSymbole symbole, int line, String column) {
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
		
		board[line][columnIndex] = symbole.toString();
		
		System.out.println("Played !");
		System.out.println("The board is now :");
		printBoard();
		
	}
	
	public static void buildBoard() {
		String[][] newBoard = {{" ", "A", "B", "C"}, {"1", "_", "_", "_"}, {"2", "_", "_", "_"}, {"3", "_", "_", "_"}};
		board = newBoard;
	}
	
	
}
