package pl.sda.mg.jpp115.zad5;

public class PrimeNumberUtil {
    public static boolean isPrimeNumber(int value) {
        for (int divider = 2; divider <= Math.sqrt(value); divider++) {
            if (value % divider == 0) {
                return false;
            }
        }

        return true;
    }
}
