package pl.sda.mg.jpp115.zad19;

public class Author2 {
    private String surname;
    private String nationality;

    public Author2(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public Author2() {
        this.surname = "dupa";
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
