public class Quadrado {
    public static double area(double lado1) {
        if (lado1 < 0) {
            throw new IllegalArgumentException("Lado deve possuir valor positivo");
        }
        return lado1*lado1;
    }
}
