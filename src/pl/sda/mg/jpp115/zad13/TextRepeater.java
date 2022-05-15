package pl.sda.mg.jpp115.zad13;

import pl.sda.mg.jpp115.util.InputUtil;

public class TextRepeater {
    public static void main(String[] args) {
        String text = InputUtil.getTextFromUser("Podaj tekst:");
        String[] words = text.split(" ");
        boolean first = true;
        for (String word : words) {
            if (first) {
                first = false;
            } else {
                System.out.print(" ");
            }
            System.out.printf("%s %s", word, word);
        }
    }
}
