public enum CategoriaProduto {
    BRINQUEDO("BRINQUEDO"), LIVRO("LIVRO"), ELETRONICO("ELETRONICO");

    private String descricao;

    CategoriaProduto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
