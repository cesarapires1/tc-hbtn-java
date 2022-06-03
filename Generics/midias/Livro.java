public class Livro extends Midia {
    private int quantidadeArtigos;

    public Livro(String nome, int quantidadeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtigos;
    }
}
