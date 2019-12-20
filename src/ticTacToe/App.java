package ticTacToe;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {		
		startProgram();
		
	}
	
	private static void startProgram() {	
		System.out.println("Hello");
		System.out.println("Welcome to java tic tac toe!");
		
		displayCommands();
		
	}
	
	private static void displayCommands() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1) Start Game");
		System.out.println("2) Restart program");
		System.out.println("3) Quit");
		
		int answer = sc.nextInt();
		System.out.println("You choose command " + answer + ").");
		
		switch (answer) {
		case 1 :
			System.out.println("The game will start soon...");
			launchNewGame();
			break;
		case 2 :
			System.out.println("Doesn't make any sense but ok...restarting the program.");
			System.out.println("");
			System.out.println("");
			startProgram();
			break;
		case 3 :
			System.out.println("Good Bye...");
			System.out.println("");
			System.out.println("");
			break;
		default :
			System.out.println("We didn't understood this... Please enter a command.");
			displayCommands();
		}
	}
	
	private static void launchNewGame() {
		Game newGame = new Game();
		Game.startGame();
	}
	
	
}
