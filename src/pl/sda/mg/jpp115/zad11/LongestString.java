package pl.sda.mg.jpp115.zad11;

import pl.sda.mg.jpp115.util.InputUtil;

public class LongestString {
    public static void main(String[] args) {
        String longestText = "";
        while (true) {
            String text = InputUtil.getTextFromUser("Podaj tekst:");
            if ("starczy".equalsIgnoreCase(text)) {
                break;
            }

            if (text.isBlank()) {
                System.out.println("Podales pusty tekst!");
                continue;
            }

            if (text.length() > longestText.length()) {
                longestText = text;
            }
        }

        System.out.println("Najdluzszy wyraz to " + longestText);
    }
}
