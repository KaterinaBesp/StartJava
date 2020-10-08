package com.startjava.lesson1.cycle;

public class Cycle {	
	public static void main(String[] args) {
		//TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		//TODO: Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		int j= 6;
		while(j >= -6) {
			System.out.println(j);
			j-= 2;
		}

		//TODO: Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20], и выведите ее на консоль
		int k = 10;
		int sum = 0;
		do {
			if (k % 2 != 0) {
				sum += k;
			}
			k++;
		} while (k <= 20);
		System.out.println("Cумма нечетных чисел: " + sum);
	}	
}