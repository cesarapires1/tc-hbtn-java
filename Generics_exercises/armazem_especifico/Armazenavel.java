public interface Armazenavel <T> {

    public abstract void adicionarAoInventario(String produto, T objetoAdicionado);
    public abstract T obterDoInventario(String produto);
}
