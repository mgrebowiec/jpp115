package pl.sda.mg.jpp115.zad19;

class Poem {
    private final Author creator;
    private final int stropheNumbers;

    Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }
}
