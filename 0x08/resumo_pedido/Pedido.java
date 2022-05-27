import provedores.*;

public class Pedido {
    private int codigo;
    private int peso;
    private double total;
    private Frete frete;

    public Pedido(int codigo, int peso, double total) {
        this.codigo = codigo;
        this.peso = peso;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPeso() {
        return peso;
    }

    public double getTotal() {
        return total;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Frete getFrete() {
        return frete;
    }
}
