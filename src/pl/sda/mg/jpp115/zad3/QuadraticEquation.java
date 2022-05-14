package pl.sda.mg.jpp115.zad3;

public class QuadraticEquation {
    private final int a;
    private final int b;
    private final int c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double calculateDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public void printQuadraticEquationResult() {
        double delta = calculateDelta();
        if (delta < 0) {
            System.out.println("Delta jest ujemna!");
            return;
        }

        if (a == 0) {
            System.out.println("A jest liczba 0 nie mozemy wyliczyc pierwiastkow!");
            return;
        }

        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.printf("x1 = %f\nx2 = %f\n", x1, x2);
    }
}
