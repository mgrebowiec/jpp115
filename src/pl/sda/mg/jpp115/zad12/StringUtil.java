package pl.sda.mg.jpp115.zad12;

public class StringUtil {

    public static int spaceCount(String text) {
        int spaceCount = 0;
        for (char character : text.toCharArray()) {
            if (character == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}
