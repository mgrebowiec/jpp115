package pl.sda.mg.jpp115.zad8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float a = getFloatNumberFromUser("Podaj wartosc liczby a:");
        float b = getFloatNumberFromUser("Podaj wartosc liczby b:");
        String operation = getStringFromUser("Jakie dzialanie mamy wykonac:");
        doOperation(a, b, operation);
    }

    private static float getFloatNumberFromUser(String textToShow) {
        Scanner in = new Scanner(System.in);
        System.out.println(textToShow);
        return in.nextFloat();
    }

    private static String getStringFromUser(String textToShow) {
        Scanner in = new Scanner(System.in);
        System.out.println(textToShow);
        return in.next();
    }

    private static void doOperation(float a, float b, String operation) {
        switch (operation) {
            case "odejmowanie":
            case "-":
                System.out.printf("%f - %f = %f", a, b, a - b);
                break;
            case "dodawanie":
            case "+":
                System.out.printf("%f + %f = %f", a, b, a + b);
                break;
            case "*":
                System.out.printf("%f * %f = %f", a, b, a * b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Nie mozna dzielic przez 0!");
                } else {
                    System.out.printf("%f / %f = %f", a, b, a / b);
                }
                break;
            default:
                System.out.println("Podales nieobslugiwany znak dzialania!");
        }
    }
}
