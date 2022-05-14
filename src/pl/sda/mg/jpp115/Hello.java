package pl.sda.mg.jpp115;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Udalo sie zaciagnac projekt z GitHuba!");
        sayHello("Michal");
    }

    private static void sayHello(String name) {
        System.out.printf("Witaj, %s", name);
    }
}
