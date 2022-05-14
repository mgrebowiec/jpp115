package pl.sda.mg.jpp115.zad7;

import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita wieksza od 0");
        int userValue = in.nextInt();
        System.out.printf("Element %d ciagu Fibonacciego ma wartosc %d\n", userValue, getValue(userValue));
    }

    private static int getValue(int elementIndex) {
        if (elementIndex < 3) {
            return 1;
        }

        return getValue(elementIndex - 1) + getValue(elementIndex - 2);
    }
}
