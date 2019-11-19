package findUniqeNumber;

public class Main {


    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0.32, 12, 12, 12.12, 12, 0.32, 0.32, 0.32}));
    }

    public static double findUniq(double arr[]) {
        boolean contains;
        for (double temp : arr) {
            contains = containsNumber(temp, arr);
            if (contains) {
                return temp;
            }
        }
        return 0;
    }

    private static boolean containsNumber(double temp, double[] arr) {
        int counter = 0;
        for (double k : arr) {
            if (temp == k) {
                counter++;
            }
            if (counter > 1) {
                return false;
            }
        }

        return true;
    }
}
