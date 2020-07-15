public class Cycle {	
	public static void main(String[] args) {
		//TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
		int number = 0;
		for (int i = 1; i < 21; i++) {
			number = number + 1;
			System.out.println(number);
		}

		// //TODO: Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		int value = -6;
		int j = 2;
		while(value <= 6) {
			System.out.println(value);
			value = value + j - 1;
		}

		//TODO: Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20], и выведите ее на консоль

		int k = 2;
		int sum =11; 
		do {
			sum = sum + k;
			if (sum % 2 != 0) {
				System.out.println(sum + " число нечетное");
			} else {
				System.out.println(sum + " число четное");
			}
			k++;
		} while (k <= 5);

		System.out.println("11 + 13 + 15 + 17 + 19 =" + sum);
	}

}	