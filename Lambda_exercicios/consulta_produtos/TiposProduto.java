public enum TiposProduto {
    COZINHA("COZINHA"), ELETRONICO("ELETRONICO"), BRINQUEDO("BRINQUEDO");

    private String descricao;

    TiposProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
