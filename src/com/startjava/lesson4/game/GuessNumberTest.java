package com.startjava.lesson4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name");
		com.startjava.lesson4.game.Player player1 = new com.startjava.lesson4.game.Player(scan.nextLine());
		System.out.println("Enter the second name");
		com.startjava.lesson4.game.Player player2 = new Player(scan.nextLine());
		com.startjava.lesson4.game.GuessNumber game = new GuessNumber(player1, player2);
		String answer;
		do {
			game.play();
			do {
				System.out.print("Do you Want to continue? [Y/N]: ");
				answer = scan.nextLine();
			} while (!answer.equals("N") && !answer.equals("Y"));
		} while (!answer.equals("N"));
	}
}	