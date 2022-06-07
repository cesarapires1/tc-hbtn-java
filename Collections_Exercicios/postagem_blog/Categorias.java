public enum Categorias {
    DEVOPS("DEVOPS"), DESENVOLVIMENTO("DESENVOLVIMENTO"), DATA_SCIENCE("DATA_SCIENCE");

    private String descricao;

    Categorias(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
