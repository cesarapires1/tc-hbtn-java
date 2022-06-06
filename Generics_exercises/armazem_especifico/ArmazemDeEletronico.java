import java.util.*;

public class ArmazemDeEletronico <T extends Armazem <T>> {
    Map<String, Eletronico> armazem = new TreeMap<>();

    public void adicionarAoInventario(String produto, Eletronico objetoAdicionado) {
        this.armazem.put(produto, objetoAdicionado);
    }

    public Eletronico obterDoInventario(String produto) {
        return armazem.get(produto);
    }

}
