public class Livro extends Midia {
    protected int quantidadeArtigos;

    public Livro(String nome, int quantidadeArtigos) {
        super(nome);
        this.quantidadeArtigos = quantidadeArtigos;
    }
}
