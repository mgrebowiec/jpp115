package pl.sda.mg.jpp115.zad4;

import java.util.Scanner;

public class NumbersSample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe dodania calkowita:");
        int maxIntValue = in.nextInt();
        for (int value = 1; value <= maxIntValue; value++) {
            if (value % 3 == 0 && value % 7 == 0) {
                System.out.println("Pif paf");
            } else if (value % 3 == 0) {
                System.out.println("Pif");
            } else if (value % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(value);
            }
        }
    }
}
