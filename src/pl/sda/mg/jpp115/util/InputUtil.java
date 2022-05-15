package pl.sda.mg.jpp115.util;

import java.util.Scanner;

public class InputUtil {
    public static int getIntNumberFromUser(String textToShow) {
        Scanner in = new Scanner(System.in);
        System.out.println(textToShow);
        return in.nextInt();
    }

    public static String getTextFromUser(String textToShow) {
        Scanner in = new Scanner(System.in);
        System.out.println(textToShow);
        return in.nextLine();
    }
}
