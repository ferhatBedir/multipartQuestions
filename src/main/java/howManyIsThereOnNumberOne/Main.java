package howManyIsThereOnNumberOne;

public class Main {
	private static final Integer value = 3;

	public static void main(String[] args) {
		int count = howManyIsThereOnNumber(value);
		System.out.println(count);
	}

	private static int howManyIsThereOnNumber(Integer value) {
		long result = 1;
		if (value <= 0) {
			System.out.println("N is negative or zero.");
			return 0;
		} else {
			for (int i = 0; i < value; i++) {
				result = result * 11;
			}
		}

		String resultToString = String.valueOf(result);
		System.out.println("11 * " + value + " = " + result);

		int count = 0;
		final String digit = "1";
		char charDigit = digit.charAt(0);

		for (int i = 0; i < resultToString.length(); i++) {
			char number = resultToString.charAt(i);
			if (number == charDigit) {
				count += 1;
			}
		}
		return count;
	}
}
