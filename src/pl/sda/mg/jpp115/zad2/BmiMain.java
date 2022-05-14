package pl.sda.mg.jpp115.zad2;

import java.util.Scanner;

public class BmiMain {
    public static void main(String[] args) {
        BodyMassIndex bmi = new BodyMassIndex(getWeightFromUser(), getHeightFormUser());
        bmi.printBmiLevel();
    }

    private static float getWeightFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj swoja wage:");
        return in.nextFloat();
    }

    private static int getHeightFormUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wzrost w cm:");
        return in.nextInt();
    }
}
