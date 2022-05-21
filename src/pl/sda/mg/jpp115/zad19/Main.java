package pl.sda.mg.jpp115.zad19;

public class Main {
    public static void main(String[] args) {
        printAuthorWithLongestStropheNumber(createPoems());
    }

    private static void printAuthorWithLongestStropheNumber(Poem[] poems) {
        Poem longestPoem = null;
        for (Poem poem : poems) {
            if (longestPoem == null) {
                longestPoem = poem;
                continue;
            }

            if (poem.getStropheNumbers() > longestPoem.getStropheNumbers()) {
                longestPoem = poem;
            }
        }

        System.out.println("Autor najdluzszego poematu to " + longestPoem.getCreator().getSurname());
    }

    private static Poem[] createPoems() {
        Poem firstPoem = new Poem(new Author("Mickiewicz", "litwa"), 100);

        Author slowacki = new Author("Slowacki", "polska");
        Poem secondPoem = new Poem(slowacki, 35);
        Poem thirdPoem = new Poem(slowacki, 101);
        Poem fourthPoem = new Poem(new Author("kowalski", "polska"), 200);
        Poem[] poems = {firstPoem, secondPoem, thirdPoem, fourthPoem};

        return poems;
    }
}
