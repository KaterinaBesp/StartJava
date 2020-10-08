public class Calculator {
	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int result;
		char sign = '^';

		if(sign == '+') {
			result = x + y;
			System.out.println(" x + y = " + result);
		} else if(sign == '-') {
			result = x - y;
			System.out.println(" x - y = " + result);
		} else if(sign == '*') {
			result = x * y;
			System.out.println(" x * y = " + result);
		} else if(sign == '/') {
			result = x / y;
			System.out.println(" x / y = " + result);
		} else if (sign == '^') {
			result = x;
			while (y > 1) { 
				result *= x;
				y--;
			}
			System.out.println(" x ^ y = " + result);
		} else if(sign == '%') {
			result = x % y;
			System.out.println(" x % y = " + result);
		}
	}
}