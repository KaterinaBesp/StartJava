package com.startjava.lesson2_3.game;

import java.util.Scanner; 

	public class Player {
	private String name;
	private int guessNumber;
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public int getGuessNumber() {
		return guessNumber;
	}
}