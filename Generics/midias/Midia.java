public class Midia {
    protected String nome;

    public Midia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String toString = String.format("Tipo: %s - Nome: %s", this.getClass().getName(), getNome());
        return toString;
    }
}
