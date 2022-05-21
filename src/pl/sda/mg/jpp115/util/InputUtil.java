package pl.sda.mg.jpp115.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    public static int[] getNumbersFromUser(int numbersCount) {
        int[] result = new int[numbersCount];
        for (int i = 0; i < result.length; i++) {
            result[i] = InputUtil.getIntNumberFromUser("Podal liczbe:");
        }
        return result;
    }

    public static LocalDate getDateFromUser(String textToShow) {
        Scanner in = new Scanner(System.in);
        System.out.println(textToShow);
        return LocalDate.parse(in.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
