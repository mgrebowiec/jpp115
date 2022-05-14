package pl.sda.mg.jpp115.zad2;

public class BodyMassIndex {
    private final float weight;
    private final float height;

    public BodyMassIndex(float weight, int heightInCm) {
        this.weight = weight;
        this.height = heightInCm / 100F;
    }

    double calculateBmi() {
        return weight / Math.pow(height, 2);
    }

    void printBmiLevel() {
        System.out.print("Poziom BMI: ");
        double bmi = calculateBmi();
        if (bmi < 18.5 || bmi > 24.9) {
            System.out.println("nieoptymalny");
        } else {
            System.out.println("optymalny");
        }
    }
}
