package pl.sda.mg.jpp115.zad19;

class Author {
    private final String surname;
    private final String nationality;

    Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }
}
