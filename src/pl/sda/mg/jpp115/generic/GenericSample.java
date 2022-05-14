package pl.sda.mg.jpp115.generic;

public class GenericSample {

    public <T extends Number> T add(T a, T b) {
        return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
    }

    public static void main(String[] args) {
        GenericSample gs = new GenericSample();
        Number result = gs.add(Integer.valueOf(1), Integer.valueOf(10));
        System.out.println(result);
    }
}
