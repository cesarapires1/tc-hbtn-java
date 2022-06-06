public interface Armazenavel  <T> {

    public void adicionarAoInventario(String produto, T objetoAdicionado);
    public T obterDoInventario(String produto);
}
