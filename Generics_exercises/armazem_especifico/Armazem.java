import java.util.*;

public abstract class Armazem <T> implements Armazenavel <T> {
    @Override
    public abstract void adicionarAoInventario(String produto,  T objetoAdicionado);

    public abstract T obterDoInventario(String produto);
}
