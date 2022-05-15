package pl.sda.mg.jpp115.zad14;

import pl.sda.mg.jpp115.util.InputUtil;

public class CharacterUtil {

    public static void main(String[] args) {
        char firstChar = InputUtil.getTextFromUser("Podaj pierwszy znak:").charAt(0);
        char secondChar = InputUtil.getTextFromUser("Podaj drugi znak:").charAt(0);
        System.out.println("Ilosc znakow pomiedzy podanymi znakami to " + countCharactersGap(firstChar, secondChar));
    }

    public static int countCharactersGap(char firstChar, char secondChar) {
        return Math.abs((int)firstChar - (int)secondChar) - 1;
    }
}
