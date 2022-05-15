package pl.sda.mg.jpp115.zad12;

import pl.sda.mg.jpp115.util.InputUtil;

public class SpaceCountMain {
    public static void main(String[] args) {
        String text = InputUtil.getTextFromUser("Podaj tekst:");
        double spaceCountPercent = StringUtil.spaceCount(text) / (double)text.length() * 100;
        System.out.println("Procentowa ilsoc spacji w tekscie: " + spaceCountPercent);
    }
}
