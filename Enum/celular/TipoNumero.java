public enum TipoNumero {
    CELULAR("CELULAR"), COMERCIAL("COMERCIAL"), CASA("CASA");

    private String descricao;

    TipoNumero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
