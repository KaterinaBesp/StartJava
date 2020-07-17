public class MyFirstGame {	
	public static void main (String [] args) {
		int randomNum = 77;
		int computerNum = 74;
		do {
			if (computerNum < randomNum) {
				System.out.println ("Введенное вами число-" + randomNum + " больше того, что загадал компьютер:");
				randomNum --;
			} else if (computerNum > randomNum) {
				System.out.println ("Введенное вами число-"+ randomNum + "меньше того, что загадал компьютер:");
				randomNum ++; }
			} while (randomNum != computerNum);
		System.out.println ("Вы угадали! " + randomNum);
	}	
}