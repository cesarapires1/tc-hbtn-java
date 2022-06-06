public class Comida {
    private String nome;
    private int calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String textoFormatado;
        textoFormatado = String.format("["+this.nome+"] "+this.calorias+" R$ "+this.preco);
        return textoFormatado;
    }
}
