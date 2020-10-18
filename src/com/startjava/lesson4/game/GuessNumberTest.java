package com.startjava.lesson4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Enter the second name");
        Player player2 = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.play ();
            do {
                System.out.print("Do you Want to continue? [Y/N]: ");
                answer = scan.nextLine();
            } while (!answer.equals("N") && !answer.equals("Y"));
        } while (!answer.equals("N"));
    }
}