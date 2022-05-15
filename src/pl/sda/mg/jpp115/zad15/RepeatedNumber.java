package pl.sda.mg.jpp115.zad15;

import pl.sda.mg.jpp115.util.InputUtil;

public class RepeatedNumber {

    public static void main(String[] args) {
        int[] numbers = getNumbersFromUser(10);
        numbers = getRepeatedNumbers(numbers);
        displayArray(numbers);
    }

    public static int[] getNumbersFromUser(int numbersCount) {
        int[] numbers = new int[numbersCount];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = InputUtil.getIntNumberFromUser("Podaj liczbe:");
        }
        return numbers;
    }

    public static int[] getRepeatedNumbers(int[] numbers) {
        int[] result = new int[numbers.length / 2];
        int resultIndex = 0;
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    if (!isArrayContainsElement(result, numbers[i])) {
                        result[resultIndex] = numbers[i];
                        resultIndex++;
                    }

                    break;
                }
            }
        }

        return result;
    }

    private static boolean isArrayContainsElement(int[] numbers, int element) {
        for (int number : numbers) {
            if (number == element) {
                return true;
            }
        }

        return false;
    }

    public static void displayArray(int[] numbers) {
        for (int number : numbers) {
            if (number != 0) {
                System.out.println(number);
            }
        }
    }

}
