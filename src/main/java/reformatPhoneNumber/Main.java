package reformatPhoneNumber;

public class Main {

	private static final String phoneNumberOne = "55-5214-78-88";
	private static final String phoneNumberTwo = "022   569-789-8-8";
	private static final String phoneNumberThree = "0312-555-55-1";

	public static void main(String[] args) {


		String newPhoneNumberStyleOne = reformat(phoneNumberOne);
		String newPhoneNumberStyleTwo = reformat(phoneNumberTwo);
		String newPhoneNumberStyleThree = reformat(phoneNumberThree);

		System.out.println(newPhoneNumberStyleOne);
		System.out.println(newPhoneNumberStyleTwo);
		System.out.println(newPhoneNumberStyleThree);


	}

	private static String reformat(String oldPhoneNumber) {
		String newFormat = "";
		String separator = "-";
		oldPhoneNumber = oldPhoneNumber.replaceAll("-", " ");
		oldPhoneNumber = oldPhoneNumber.replaceAll(" ", "");

		if (oldPhoneNumber.length() % 3 == 0) {
			newFormat = separateThreeBlock(oldPhoneNumber, newFormat);
		} else if (oldPhoneNumber.length() % 3 == 1) {
			String part1 = oldPhoneNumber.substring(0, oldPhoneNumber.length() - 4);
			String part2 = oldPhoneNumber.substring(oldPhoneNumber.length() - 4);
			newFormat = separateThreeBlock(part1, newFormat) + separator;

			for (int i = 0; i < part2.length(); i++) {
				if (i % 2 == 1) {
					if (i == part2.length() - 1) {
						newFormat += part2.charAt(i);
					} else {
						newFormat += part2.charAt(i) + separator;
					}
				} else {
					newFormat += part2.charAt(i);
				}
			}
		} else {
			String part1 = oldPhoneNumber.substring(0, oldPhoneNumber.length() - 2);
			String part2 = oldPhoneNumber.substring(oldPhoneNumber.length() - 2);
			newFormat = separateThreeBlock(part1, newFormat) + separator;
			newFormat += part2;
		}
		return newFormat;
	}

	private static String separateThreeBlock(String oldPhoneNumber, String newPhoneNumber) {
		String separator = "-";
		for (int i = 0; i < oldPhoneNumber.length(); i++) {
			if (i % 3 == 2) {
				if (i == oldPhoneNumber.length() - 1) {
					newPhoneNumber += oldPhoneNumber.charAt(i);
				} else {
					newPhoneNumber += oldPhoneNumber.charAt(i) + separator;
				}
			} else {
				newPhoneNumber += oldPhoneNumber.charAt(i);
			}
		}
		return newPhoneNumber;
	}
}
