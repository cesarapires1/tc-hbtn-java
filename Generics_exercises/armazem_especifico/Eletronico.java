public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String toString() {
        String textoFormatado;
        textoFormatado = String.format("["+this.descricao+"] R$ %.6f",this.valor);
        return textoFormatado;
    }
}
