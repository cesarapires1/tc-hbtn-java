public class Comida {
    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, int calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    @Override
    public String toString() {
        String textoFormatado;
        textoFormatado = String.format("["+this.nome+"] %.6f R$ %.6f",this.calorias, this.preco);
        return textoFormatado;
    }
}
