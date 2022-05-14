package pl.sda.mg.jpp115.zad3;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(
                getValueFromUser("a"),
                getValueFromUser("b"),
                getValueFromUser("c")
        );

        qe.printQuadraticEquationResult();
    }

    private static int getValueFromUser(String parameterName) {
        Scanner in = new Scanner(System.in);
        System.out.printf("\nPodaj wartosc wspolczynnika %s:", parameterName);
        return in.nextInt();
    }
}
