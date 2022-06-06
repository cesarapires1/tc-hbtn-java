import java.util.*;

public class Armazem<T> implements Armazenavel {
    Map<String, T> armazem = new TreeMap<>();

    @Override
    public void adicionarAoInventario(String produto,  Object objetoAdicionado) {
        this.armazem.put(produto, (T) objetoAdicionado);
    }

    public T obterDoInventario(String produto) {
        return armazem.get(produto);
    }
}
