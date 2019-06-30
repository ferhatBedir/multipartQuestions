package isANumberPrime;

public class Main {

	private static final Integer value = 2;

	public static void main(String[] args) {
		boolean isPrime = isANumberPrime(value);
		System.out.println(value + " " + isPrime);
	}

	private static boolean isANumberPrime(Integer value) {
		if (value <= 1) {
			return false;
		}
		double sqrt = Math.sqrt(value);
		for (int i = 2; i <= sqrt; i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
}

