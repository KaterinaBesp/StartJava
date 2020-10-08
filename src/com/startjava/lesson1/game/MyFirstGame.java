package com.startjava.lesson1.game;

public class MyFirstGame {	
	public static void main(String[] args) {
		int rndNum = 77;
		int compNum = 74;
		do {
			if (compNum < rndNum) {
				System.out.println ("Введенное вами число - " + rndNum + " больше того, что загадал компьютер:");
				rndNum--;
			} else if (compNum > rndNum) {
				System.out.println ("Введенное вами число - "+ rndNum + "меньше того, что загадал компьютер:");
				rndNum++; 
			}
		} while (rndNum != compNum);
		System.out.println("Вы угадали! " + rndNum);
	}
}