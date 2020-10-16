package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private int rndNum;
    private com.startjava.lesson4.game.Player player1;
    private com.startjava.lesson4.game.Player player2;
    private boolean isAlive;
    private Scanner scan = new Scanner(System.in);


    public GuessNumber(com.startjava.lesson4.game.Player player1, com.startjava.lesson4.game.Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        isAlive = true;
        rndNum = (int) (Math.random() * 101);
        System.out.println("You have 10 attempts");
 //       System.out.println(rndNum);
        for (int stepNumber = 1; stepNumber <= 10; stepNumber++) {
            player1.setCountOfAttempts(stepNumber);
            if (!makeMove(player1)) {
                break;
            }
            player2.setCountOfAttempts(stepNumber);
            if (!makeMove(player2)) {
                break;
            }
        }

        System.out.println(Arrays.toString(player1.getGuessNumbers()));
        System.out.println(Arrays.toString(player2.getGuessNumbers()));

        player1.clearGuessNumbers();
        player2.clearGuessNumbers();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        if (!compareNumbers(player)) {
            if (player.getCountOfAttempts() == 10) {
                System.out.println("Player " + player.getName() + " attempts are over");
            }
            return true;
        } else return false;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " enter the suggested number");
        player.putGuessNumber(scan.nextInt());
        scan.nextLine();
    }

    private boolean compareNumbers(Player player) {
        if (player.getGuessNumber() > rndNum) {
            System.out.println("The entered number - is greater than the computer guessed");
        } else if (player.getGuessNumber() < rndNum) {
            System.out.println("The entered number - is less than what the computer guessed");
        } else {
            System.out.println(player.getName() + " You guessed it in " + player.getCountOfAttempts() + " attempts.The hidden number " + rndNum);
            return true;
        }
        return false;
    }
}