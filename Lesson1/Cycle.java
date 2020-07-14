public class Cycle {	
	public static void main(String[] args) {
		//TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
		// int number = 0;
		// for (int i = 1; i < 21; i++) {
		// 	number = number + 1;
		// 	System.out.println(number);
		// }

		// //TODO: Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		// int value = -6;
		// int i = 2;
		// while(value <= 6) {
		// 	System.out.println(value);
		// 	value = value + i - 1;
		// }

		//TODO: Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20], и выведите ее на консоль
		int i = 2;
		int result = 1;
		do {
			result = result + i;
			if (result % 2 == 0) {
				System.out.ptintln("Число " + result +" является четным");
			} else {
				System.out.ptintln("Число " + result +" является нечетным");
			}
			i++;
		} while (i <= 5);
		 	
		System.out.ptintln("1 + 2 + 3 + 4 + 5 =" + result);
	}
}	