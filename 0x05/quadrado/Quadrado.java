public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        setAltura(lado);
        setLargura(lado);
        this.lado = lado;
    }

    @Override
    public String toString() {
        return String.format("[Quadrado] %.2f",getLado());
    }
}
