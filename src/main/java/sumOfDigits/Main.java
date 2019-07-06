package sumOfDigits;

public class Main {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(992));
	}

	private static int sumOfDigits(int n) {
		if (n < 10) {
			return n;
		}
		int value;
		value = calculate(n);
		for (; ; ) {
			if (value > 10) {
				value = calculate(value);
			} else {
				return value;
			}
		}
	}

	private static int calculate(int n) {
		int result = 0;
		for (int i = 0; i < String.valueOf(n).length(); i++) {
			result += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
		}
		return result;
	}
}
