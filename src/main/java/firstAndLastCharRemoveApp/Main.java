package firstAndLastCharRemoveApp;

public class Main {

	private static final String text = "textExample";

	public static void main(String[] args) {

		/**
		It's pretty straightforward. Your goal is to create a function that removes the first and last characters of
		a string. You're given one parameter, the original string.
		You don't have to worry with strings with less than two characters.
		 **/

		System.out.println(firstAndLastCharRemoveMethod(text));
	}

	private static String firstAndLastCharRemoveMethod(String text) {
		String newText = "";
		int textLength = text.length();
		for (int i = 1; i < textLength - 1; i++) {
			newText += text.charAt(i);
		}
		return newText;
	}
}
