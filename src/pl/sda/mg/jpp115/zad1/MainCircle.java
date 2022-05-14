package pl.sda.mg.jpp115.zad1;

import java.util.Scanner;

public class MainCircle {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        System.out.println("Obwod kola: " + calculatePerimeter(getDiameterFromUser()));
    }

    static float calculatePerimeter(float diameter) {
        return PI * diameter;
    }

    static float getDiameterFromUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj srednice okregu:");
        return in.nextFloat();
    }
}
