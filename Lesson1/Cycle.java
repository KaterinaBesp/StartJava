public class Cycle {
	public static void main(String[] args) {
		//TODO: Выведите на консоль с помощью цикла for все числа от [0, 20]
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		//TODO: Выведите на консоль с помощью цикла while все числа от [6, -6] (шаг итерации равен 2)
		int counter = 8;
		int j = 2;
		while(counter > -5) {
			counter = counter - j;
				System.out.println(counter);
			counter+= 1;
		}

		//TODO: Подсчитайте с помощью цикла do-while сумму нечетных чисел от [10, 20], и выведите ее на консоль
		int num = 20;
		int k = 10;
		int sum = 0;
		do {
			if(k % 2 != 0)
			sum += k;
		    k++;
		} while (k <= num);
		System.out.println("Cумма нечетных чисел: "+ sum);
	}	
}
