package findRepeatedLetters;

public class Main {
	public static void main(String[] args) {
		/**
		 Are there any repeated letters?
		 if there is true, there is not false
		 */

		System.out.println("( Text = Dermatoglyphics ) Are there any repeated letters? == " + findRepeatedLetters("Dermatoglyphics"));
		System.out.println("( Text = isogram ) Are there any repeated letters? == " + findRepeatedLetters("isogram"));
		System.out.println("( Text = moose ) Are there any repeated letters? == " + findRepeatedLetters("moose"));
		System.out.println("( Text = isIsogram ) Are there any repeated letters? == " + findRepeatedLetters("isIsogram"));
		System.out.println("( Text = aba ) Are there any repeated letters? == " + findRepeatedLetters("aba"));
		System.out.println("( Text = moOse ) Are there any repeated letters? == " + findRepeatedLetters("moOse"));
		System.out.println("( Text = thumbscrewjapingly ) Are there any repeated letters? == " + findRepeatedLetters("thumbscrewjapingly"));
		System.out.println("( Text = empty ) Are there any repeated letters? == " + findRepeatedLetters(""));


	}

	public static boolean findRepeatedLetters(String str) {
		boolean isSame = true;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (j != i) {
					if (Character.toString(str.charAt(i)).toLowerCase().equals(Character.toString(str.charAt(j)).toLowerCase())) {
						isSame = false;
						break;
					}
				}
			}
		}
		return isSame;
	}
}
