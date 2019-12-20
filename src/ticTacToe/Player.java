package ticTacToe;

import java.util.Scanner;

public class Player {
	String name;
	PlayerSymbole symbole;
	int points;
	
	Player(String playerName, PlayerSymbole playerSymbole) {
		name = playerName;
		symbole = playerSymbole;
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + " will play :");
		System.out.println("--");
		
	}

}
