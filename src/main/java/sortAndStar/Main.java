package sortAndStar;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String result = twoSort(new String[]{"ATqw","akR"});
        System.out.println(result);
    }

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }


}
