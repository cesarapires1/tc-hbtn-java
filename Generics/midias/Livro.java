public class Livro extends Midia {
    protected int edicao;

    public Livro(String nome, int edicao) {
        super(nome);
        this.edicao = edicao;
    }
}
