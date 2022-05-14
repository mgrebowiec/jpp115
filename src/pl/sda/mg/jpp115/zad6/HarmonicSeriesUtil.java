package pl.sda.mg.jpp115.zad6;

public class HarmonicSeriesUtil {

    public static double sumElements(int elementsCount) {
        double sum = 0;
        for (int divider = 1; divider <= elementsCount; divider++) {
            sum += 1F / divider;
        }
        return sum;
    }
}
