import java.util.*;

public class ArmazemDeComida <T extends Armazem <T>> {
    Map<String, Comida> armazem = new TreeMap<>();

    public void adicionarAoInventario(String produto,  Comida objetoAdicionado) {
        this.armazem.put(produto, objetoAdicionado);
    }

    public Comida obterDoInventario(String produto) {
        return armazem.get(produto);
    }

}
