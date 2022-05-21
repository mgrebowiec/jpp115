package pl.sda.mg.jpp115.zad20;

import pl.sda.mg.jpp115.util.InputUtil;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random r = new Random();
        int randomValue = r.nextInt(101);
        while (true) {
            int userValue = InputUtil.getIntNumberFromUser("Podaj liczbe: ");
            if (userValue == randomValue) {
                System.out.println("Bingo, udalo Ci sie odgadnac liczbe!");
                break;
            }

            if (userValue < randomValue) {
                System.out.println("Liczba za mala!");
            } else {
                System.out.println("Liczba za duza");
            }

        }

    }
}
