package pl.sda.mg.jpp115.additional.zad7;

public class CharacterCount {
    private char character;
    private int counter;

    public CharacterCount(char character) {
        this.character = character;
        this.counter = 1;
    }

    public void increment() {
        counter++;
    }

    public char getCharacter() {
        return character;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "CharacterCount{" +
                "character=" + character +
                ", counter=" + counter +
                '}';
    }
}
