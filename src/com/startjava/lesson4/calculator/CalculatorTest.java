package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print ("Enter math expression:");
			calculator.setSrcMathExpression (scan.nextLine ());
			calculator.calculate ();
			do {
				System.out.print("Do you Want to continue? [Y/N]: ");
				answer = scan.nextLine();
			} while (!answer.equals("N") && !answer.equals("Y"));
		} while (!answer.equals("N"));
	}
}