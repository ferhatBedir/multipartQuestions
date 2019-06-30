package reverseAllWords;

public class Main {

	private final static String textOne = "The quick brown fox jumps over the lazy dog.";
	private final static String textTwo = "double  spaced  words";
	private final static String textThree = "      ";

	public static void main(String[] args) {
		/**
		 Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

		 Examples
		 "This is an example!" ==> "sihT si na !elpmaxe"
		 "double  spaces"      ==> "elbuod  secaps"
		 */

		String newTextOne = reverseWord(textOne);
		String newTextTwo = reverseWord(textTwo);
		String newTextThree = reverseWord(textThree);

		System.out.println(newTextOne);
		System.out.println(newTextTwo);
		System.out.println(newTextThree);
	}

	private static String reverseWord(String text) {
		String textArray[] = text.split(" ");
		String newText = "";

		if (textArray.length == 0 ){
			return text;
		}
			for (int i = 0; i < textArray.length; i++) {
				int length = textArray[i].length();
				String newStr = "";
				for (; length > 0; length--) {
					newStr += textArray[i].charAt((length) - 1);
				}
				if (i == textArray.length - 1) {
					newText += newStr;
				} else {
					newText += newStr + " ";
				}
			}
		return newText;
	}
}
