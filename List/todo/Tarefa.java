public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        setDescricao(descricao);
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.equals("") || descricao.equals(null)) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        }
        this.descricao = descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }
}
