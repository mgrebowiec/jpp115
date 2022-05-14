package pl.sda.mg.jpp115.zad5;

import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita wieksza od 1");
        int userValue = in.nextInt();

        for (int i = 2; i < userValue; i++) {
            if (PrimeNumberUtil.isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
