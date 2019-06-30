package removeVowelsInText;

public class Main {
	private static String text = "No offense but,\\nYour writing is among the worst I've ever read";

	public static void main(String[] args) {
		/**
		  Remove Vowels In Text and return new text
		 */

		StringBuffer stringBuffer = new StringBuffer();
		String[] vowelList = {"a", "e", "ı", "i", "o", "ö", "u", "ü", "\n"};

		for (int i = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (Character.toString(character).toLowerCase().equals(vowelList[0])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[1])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[2])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[3])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[4])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[5])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[6])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[7])) {

			} else if (Character.toString(character).toLowerCase().equals(vowelList[8])) {
				stringBuffer.append("\\n");
			} else {
				stringBuffer.append(character);
			}
		}


		System.out.println(stringBuffer);
	}
}
