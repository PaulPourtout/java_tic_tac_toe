package ticTacToe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Game {
	static char[][] board;
	static Player winner;
	static Player currentPlayer;
	static int turnsNumber;
	static int maxTurnsNumber = 9;
	
	Game() {
		buildBoard();
	}	
	
	public static void startGame() {		
		Player player1 = new Player("Toto", PlayerSymbole.O);
		Player player2 = new Player("Titi", PlayerSymbole.X);
		
		System.out.println("");
		System.out.println("Really starting the game now :");
		System.out.println("");
		
		
		printBoard();
		currentPlayer = player1;
		
		while (winner == null || turnsNumber < maxTurnsNumber) {
			playerTurn();
			
			currentPlayer = currentPlayer == player1 ? player2 : player1;
			turnsNumber++;
		}
	}
	
	public static void printBoard() {
		if (board != null) {		
			for (char[] line : board) {
				System.out.println(String.valueOf(line));
			}
		}
	}
	
	public static void playerTurn() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("On what line do you want to play (between 1 and 3 included) :");
		int playerLine = sc.nextInt();
		System.out.println("You want to play on line " + playerLine + ".");
		System.out.println("On what column do you want to play (A, B or C) :");
		char playerColumn = sc.next().charAt(0);
		System.out.println("You want to play on column " + playerColumn + ".");
		
		
		updateBoard(currentPlayer.symbole, playerLine, playerColumn);
	}
	
	public static void updateBoard(PlayerSymbole symbole, int line, char column) {
		int columnIndex;
		
		switch(column) {
			case('A'):
				columnIndex = 2;
				break;
			case('B'):
				columnIndex = 4;
				break;
			case('C'):
				columnIndex = 6;
				break;
			default:
				System.out.println("Bad column name...");
				System.out.println("Enter A, B or C.");
				playerTurn();
				return;
		}
		
		if (line < 0 || line > 3) {
			System.out.println("Bad line number...");
			System.out.println("Enter a number between 1 and 3 included.");
			playerTurn();
			return;
		}
		
		if (board[line][columnIndex] != '_') {
			System.out.println("");
			System.out.println("Someone already played here !");
			System.out.println("");
			playerTurn();
			return;
		}
		
		board[line][columnIndex] = symbole.asChar();
		
		System.out.println("Played !");
		System.out.println("The board is now :");
		printBoard();
		
	}
	
	public static void buildBoard() {
		char[][] newBoard = {{' ', ' ', 'A', ' ', 'B', ' ', 'C'}, {'1', ' ', '_', ' ', '_', ' ', '_'}, {'2', ' ', '_', ' ', '_', ' ', '_'}, {'3', ' ', '_', ' ', '_', ' ', '_'}};
		board = newBoard;
	}
	
	
}
