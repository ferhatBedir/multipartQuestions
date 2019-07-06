package humanReadableTime;

public class Main {

	private static final Integer aHoursToSeconds = 3600;
	private static final Integer aMinutesToSeconds = 60;

	public static void main(String[] args) {

		System.out.println(convertToReadAbleTimeShortWay(3600));
		System.out.println(convertToReadAbleTimeLongWay(3600));
	}

	//long way
	private static String convertToReadAbleTimeLongWay(int value) {
		int hours;
		int minutes = 0;
		int seconds = 0;
		int remaining;
		if ((value >= 0) && (value <= 359999)) {
			if (value >= aHoursToSeconds) {
				remaining = value % aHoursToSeconds;
				hours = (value - remaining) / aHoursToSeconds;
				if (hours > 99) {
					return null;
				}

				if (remaining > aMinutesToSeconds) {
					int tempRemaining = remaining % aMinutesToSeconds;
					minutes = (remaining - tempRemaining) / aMinutesToSeconds;
					seconds = tempRemaining;
				} else {
					minutes = 0;
					seconds = remaining;
				}

				if (minutes > 59) {
					return null;
				}

				String hoursString = String.valueOf(hours);
				String minutesString = String.valueOf(minutes);
				String secondsString = String.valueOf(seconds);
				if (hoursString.length() == 1) {
					hoursString = "0" + hoursString;
				}

				if (minutesString.length() == 1) {
					minutesString = "0" + minutesString;
				}

				if (secondsString.length() == 1) {
					secondsString = "0" + secondsString;
				}
				return hoursString + ":" + minutesString + ":" + secondsString;
			} else if (value >= aMinutesToSeconds) {
				remaining = value % aMinutesToSeconds;
				minutes = (value - remaining) / aMinutesToSeconds;
				String minutesString = String.valueOf(minutes);
				if (minutesString.length() == 1) {
					minutesString = "0" + minutesString;
				}
				String remainingString = String.valueOf(remaining);
				if (remainingString.length() == 1) {
					remainingString = "0" + remainingString;
				}

				return "00:" + minutesString + ":" + remainingString;
			} else {
				String secondsString = String.valueOf(value);
				if (secondsString.length() == 1) {
					secondsString = 0 + String.valueOf(value);
				}
				return "00:00:" + secondsString;
			}
		}
		return null;
	}


	// short way
	private static String convertToReadAbleTimeShortWay(int seconds) {
		int h = seconds / 60 / 60;
		int min = seconds / 60 % 60;
		int sec = seconds % 60;
		return String.format("%02d:%02d:%02d", h, min, sec);
	}

}
