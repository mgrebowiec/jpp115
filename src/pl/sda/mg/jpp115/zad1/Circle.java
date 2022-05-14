package pl.sda.mg.jpp115.zad1;

import java.util.Scanner;

public class Circle {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
    }

    public double calculatePerimeter() {
        return Math.PI * diameter;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(getDiameterFromUser());
        System.out.println("Obwod kola: " + circle.calculatePerimeter());
    }

    public static double getDiameterFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj srednice okregu:");
        return in.nextDouble();
    }
}
