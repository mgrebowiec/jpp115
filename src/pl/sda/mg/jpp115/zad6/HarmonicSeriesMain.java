package pl.sda.mg.jpp115.zad6;

import java.util.Scanner;

public class HarmonicSeriesMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita wieksza od 1");
        int userValue = in.nextInt();

        System.out.printf("Suma %d elemntow szeregu harmonicznego: %f\n", userValue, HarmonicSeriesUtil.sumElements(userValue));
    }
}
