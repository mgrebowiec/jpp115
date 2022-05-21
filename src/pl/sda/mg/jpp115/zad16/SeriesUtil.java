package pl.sda.mg.jpp115.zad16;

import pl.sda.mg.jpp115.util.InputUtil;

public class SeriesUtil {



    public static int getLongestPath(int[] numbers) {
        int longestPath = 0;
        int tempLongestPath = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i - 1] < numbers[i]) {
                tempLongestPath++;
                if (tempLongestPath > longestPath) {
                    longestPath = tempLongestPath;
                }
            } else {
                tempLongestPath = 1;
            }
        }

        return longestPath;
    }
}
