public enum TipoMensagem {
    AVISO("Aviso"),
    ERRO("Erro"),
    LOG("Log");

    private String descricao;

    TipoMensagem(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
