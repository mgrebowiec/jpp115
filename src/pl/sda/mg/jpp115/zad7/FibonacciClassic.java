package pl.sda.mg.jpp115.zad7;

import java.util.Scanner;

public class FibonacciClassic {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita wieksza od 0");
        int userValue = in.nextInt();
        System.out.printf("Element %d ciagu Fibonacciego ma wartosc %d\n", userValue, getElement(userValue));
    }

    private static int getElement(int elementIndex) {
        int previousElement = 1;
        int actualElement = 1;

        for (int n = 3; n <= elementIndex; n++) {
            int newElement = previousElement + actualElement;
            previousElement = actualElement;
            actualElement = newElement;
        }

        return actualElement;

    }
}
