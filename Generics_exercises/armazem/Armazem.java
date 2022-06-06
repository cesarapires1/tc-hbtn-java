import java.util.*;

public class Armazem <T> implements Armazenavel <T> {
    Map<String, T> armazem = new TreeMap<>();

    @Override
    public void adicionarAoInventario(String produto,  T objetoAdicionado) {
        this.armazem.put(produto, objetoAdicionado);
    }

    public T obterDoInventario(String produto) {
        return armazem.get(produto);
    }
}
