package pl.sda.mg.jpp115.zad18;

import pl.sda.mg.jpp115.util.InputUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSample {
    public static void main(String[] args) {
        String text = InputUtil.getTextFromUser("Podaj tekst:");

        // .* to jest dowolny znak w dowolnej ilości i dzięki temu funkcja matches() działa poprawnie (też)
        Pattern p = Pattern.compile(".*a+ psik.*");
        Matcher m = p.matcher(text);
        if (m.matches()) {
            System.out.println("na zdrowie!");
        }
    }
}
