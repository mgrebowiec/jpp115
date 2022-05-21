package pl.sda.mg.jpp115.literaz;

public class ZSample {
    public static void main(String[] args) {
        String character = "*";
        int length = 7;

        for (int i = 1; i <= length; i++) { // i odpowiada za numer wiersza
            for (int j = 1; j <= length; j++) { // j odpowiada za numer kolumny
                if (i == 1 || i == length) {
                    System.out.print(character);
                } else if (i + j == length + 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
