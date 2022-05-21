package pl.sda.mg.jpp115.zad16;

import pl.sda.mg.jpp115.util.InputUtil;

public class SeriesMain {
    public static void main(String[] args) {
        int[] numbers = InputUtil.getNumbersFromUser(10);
        int longestPath = SeriesUtil.getLongestPath(numbers);
        printTable(numbers);
        System.out.println("Najdluzszy podciag rosnacy ma dlugosc: " + longestPath);
    }

    private static void printTable(int[] numbers) {
        for (int number: numbers) {
            System.out.printf("%d, ", number);
        }
        System.out.println();
    }
}
