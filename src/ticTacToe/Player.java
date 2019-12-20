package ticTacToe;

import java.util.Scanner;

public class Player {
	String name;
	int points;
	
	Player(String playerName) {
		name = playerName;
	}
	
	public void play() {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + " will play :");
		System.out.println("--");
		
	}

}
