package com.startjava.lesson2_3.calculator;

public class Calculator {

	private	int x;
	private	int y;
	private	int result;
	private	char sign;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getSign() {
		return sign;
	}

	public void setSign(char sign) {
		this.sign = sign;
	}

	public int calculate() {
		switch(sign){
			case '+':
				result = x + y;
				System.out.println(" x + y = " + result);
				break;
			case '-':
				result = x - y;
				System.out.println(" x - y = " + result);
			case  '*':
				result = x * y;
				System.out.println(" x * y = " + result);
				break;
			case '/':
				result = x / y;
				System.out.println(" x / y = " + result);
				break;
			case  '^':
				result = x;
				while (y > 1) { 
					result *= x;
					y--;
				}
				System.out.println(" x ^ y = " + result);
				break;
			case '%':
				result = x % y;
				System.out.println(" x % y = " + result);
				break;
		}	
		return result;
	}
}