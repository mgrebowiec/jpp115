package pl.sda.mg.jpp115.zad9;

import java.util.Scanner;

public class Wave {
    public static void main(String[] args) {
        printWave(6, getIntNumberFromUser("Podaj dlugosc fali:"), "*");
    }

    private static int getIntNumberFromUser(String textToShow) {
        Scanner in = new Scanner(System.in);
        System.out.println(textToShow);
        return in.nextInt();
    }

    private static void printWave(int height, int length, String character) {
        for (int i = 1; i <= height; i++) { // i --> indeks reprezentujący wiersz
            for (int j = 1; j <= length; j++) { //j --> indeks reprezentujacy kolumny w danym wierszu
                int tempIndex = j % height;
                tempIndex = tempIndex == 0 ? height : tempIndex; // 1,2,3,4 -->znormalizowany index odpowiadajacy j

                if (((j - 1) / height) % 2 == 1) {
                    // czesc wznoszaca naszej fali
                    if (i == height - tempIndex + 1) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    // czesc opadajaca naszej fali
                    if (i == tempIndex) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
