package com.startjava.lesson2_3.game;

import java.util.Scanner; 

public class GuessNumber {
	private int rndNum;
	private Player player1;
	private Player player2;
	private int tryNumber;
	private boolean isAlive;
	private static final int MAX_ATTEMPTS_NUMBER = 10;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start () {

		System.out.println ("You have 10 attempts!");

		do {
			if (makeMove (player1)) {
				break;
			}

			if (makeMove (player2)) {
				break;;
			}

			tryNumber ++;

		}  while (tryNumber <MAX_ATTEMPTS_NUMBER);

		if (tryNumber >= MAX_ATTEMPTS_NUMBER) {
			System.out.println («Простите, ребята! Ваши попытки окончены!»);
		}
		displayNumbers ();
		player1.zeroize (tryNumber);
		player2.zeroize (tryNumber);
	}

	private boolean makeMove (Player player) {
		System.out.println (player.getName () + ", угадайте число, пожалуйста:");
		player.setNumber (tryNumber, scan.nextInt ());
		return compareNumbers (игрок);
	}

	public void play() {
		isAlive = true;
		rndNum = (int) (Math.random() * 101);
		do {
			System.out.print(player1.getName() + ", First player enter number ");
			player1.setGuessNumber(scan.nextInt());
			scan.nextLine();
			compareNumber(player1);
			if (isAlive) {
				System.out.print(player2.getName() + ", Second player enter number ");
				player2.setGuessNumber(scan.nextInt());
				scan.nextLine();
				compareNumber(player2);
			}
		} while (isAlive);
	}

	private void compareNumber(Player player) {
		if (player.getGuessNumber() > rndNum) {
			System.out.println("The entered number - is greater than the computer guessed");
		} else if (player.getGuessNumber() < rndNum) {
			System.out.println("The entered number - is less than what the computer guessed");
		} else {
			System.out.println(player.getName() + ", You guessed! " + player.getGuessNumber());
			isAlive = false;
		}
	}
}