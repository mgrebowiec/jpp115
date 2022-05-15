package pl.sda.mg.jpp115.zad10;

import pl.sda.mg.jpp115.util.InputUtil;

public class DigitsSum {
    public static void main(String[] args) {
        int number = InputUtil.getIntNumberFromUser("Podaj liczbe:");
        int sum = 0;
        while (true) {
            sum += number % 10;
            number /= 10;
            if (number == 0) {
                break;
            }
        }

        System.out.println("Suma cyfr = " + sum);
    }


}
