import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print("Enter the first number:");
			calculator.setX(scan.nextInt());
			scan.nextLine();
			System.out.print("Select an operation: ");
			calculator.setSign(scan.nextLine().charAt(0));
			System.out.print("Enter the second number: ");
			calculator.setY(scan.nextInt());
			scan.nextLine();
			calculator.calculate();
			do {
				System.out.print("Do you Want to continue? [Y/N]: ");
				answer = scan.nextLine();
			} while (!answer.equals("N") && !answer.equals("Y"));
		} while (!answer.equals("N"));
	}
}